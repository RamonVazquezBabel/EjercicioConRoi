package com.example.ejercicioConRoi.services;

import com.example.ejercicioConRoi.exceptions.RequiredMissingFieldException;
import com.example.ejercicioConRoi.exceptions.WrongLengthFieldException;
import com.example.ejercicioConRoi.models.Persona;

public interface PersonaService {
    Persona addPersona(Persona persona) throws RequiredMissingFieldException, WrongLengthFieldException;
}
