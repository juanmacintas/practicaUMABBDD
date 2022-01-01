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

    /*
        {"datasetId":1, "client": "acme", "vendor": "air america", "invoiceCode": "AA343234321", "description": "DALAS - MIAMI Flight", "fiscalYear": "2021", "currency": "dollar", "spend": 121.45, "userName": "jsmith", "defaultCategory": "Travel", "timestamp": "20210612"}
    */
    @PostMapping("/insert")
    public void insert(@RequestBody RawDto raw) {
        service.insert(raw);
    }

    @GetMapping("/getAll")
    public List<RawDto> getAll() {
        return service.getAll();
    }
}
