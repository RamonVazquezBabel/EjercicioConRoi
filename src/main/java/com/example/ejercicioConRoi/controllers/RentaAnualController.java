package com.example.ejercicioConRoi.controllers;

import com.example.ejercicioConRoi.models.RentaAnual;
import com.example.ejercicioConRoi.services.RentaAnualService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentaAnualController {
    RentaAnualService rentaAnualService;

    public RentaAnualController(RentaAnualService rentaAnualService) {
        this.rentaAnualService = rentaAnualService;
    }

    @PostMapping("/renta")
    ResponseEntity addRenta(@RequestBody RentaAnual rentaAnual){
        rentaAnualService.addRentaAnual(rentaAnual);
        return ResponseEntity.ok(rentaAnual);
    }

}
