package org.uma.data.ingestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.uma.data.ingestion.dto.RawDto;
import org.uma.data.ingestion.service.RawService;

@RestController("/raw")
public class RawController {
    @Autowired
    RawService service;

    @PostMapping("/insert")
    public void insert(@RequestBody RawDto raw) {
        service.insert(raw);
    }

    @GetMapping("/getAll")
    public List<RawDto> getAll() {
        return service.getAll();
    }
}
