package org.uma.data.ingestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.uma.data.ingestion.dto.CleanDto;
import org.uma.data.ingestion.dto.RawDto;
import org.uma.data.ingestion.service.CleanService;
import org.uma.data.ingestion.service.RawService;

@RestController("/raw")
public class RawController {
    @Autowired
    RawService rawService;

    @Autowired
    CleanService cleanService;

    @PostMapping("/insert")
    public void insert(@RequestBody RawDto raw) {
        rawService.insert(raw);
    }

    @PostMapping("/rawinsert")
    public void insertRaw(@RequestBody List<RawDto> raw) {
        raw.forEach(r -> rawService.insert(r));
    }

    @GetMapping("/getAll")
    public List<RawDto> getAll() {
        return rawService.getAll();
    }

    @PostMapping("/clean")
    public List<CleanDto> clean() {
        return cleanService.clean();
    }

    @GetMapping("/getAllClean")
    public List<CleanDto> getAllClean() {
        return cleanService.getAll();
    }
}
