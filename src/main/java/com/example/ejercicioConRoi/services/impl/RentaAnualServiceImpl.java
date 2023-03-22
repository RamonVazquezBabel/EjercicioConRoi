package com.example.ejercicioConRoi.services.impl;

import com.example.ejercicioConRoi.models.RentaAnual;
import com.example.ejercicioConRoi.persistance.database.mappers.ProfesionMapper;
import com.example.ejercicioConRoi.services.RentaAnualService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RentaAnualServiceImpl implements RentaAnualService {
    private ProfesionMapper profesionMapper;
    private RentaAnualService rentaAnualService;

    public RentaAnualServiceImpl(ProfesionMapper profesionMapper, RentaAnualService rentaAnualService) {
        this.profesionMapper = profesionMapper;
        this.rentaAnualService = rentaAnualService;
    }

    @Override
    @Transactional
    public RentaAnual addRentaAnual(RentaAnual rentaAnual) {
        System.out.println("Hecho el servicio de renta anual");

        return rentaAnual;
    }
}
