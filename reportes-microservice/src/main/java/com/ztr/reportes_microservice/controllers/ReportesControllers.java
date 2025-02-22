package com.ztr.reportes_microservice.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/reportes")
public class ReportesControllers {
    @GetMapping
    ResponseEntity<List<String>> getReports(){
        List<String> myReports = new ArrayList<>();
        myReports.add("Reporte1");
        myReports.add("Reporte2");
        myReports.add("Reporte3");
        return ResponseEntity.ok().body(myReports);
    }
}
