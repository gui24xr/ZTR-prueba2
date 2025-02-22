package com.ztr.factura_microservice.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/facturas")
public class ControllerFacturas {
    @GetMapping
    ResponseEntity<List<String>> getFacturas(){
        List<String> myFacturas = new ArrayList<>();
        myFacturas.add("Factura1");
        myFacturas.add("factura2");
        myFacturas.add("Factura3");
        return ResponseEntity.ok().body(myFacturas);
    }
}
