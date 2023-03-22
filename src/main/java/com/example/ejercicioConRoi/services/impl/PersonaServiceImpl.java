package com.example.ejercicioConRoi.services.impl;

import com.example.ejercicioConRoi.exceptions.RequiredMissingFieldException;
import com.example.ejercicioConRoi.exceptions.WrongLengthFieldException;
import com.example.ejercicioConRoi.models.Direccion;
import com.example.ejercicioConRoi.models.Persona;
import com.example.ejercicioConRoi.persistance.database.mappers.DireccionMapper;
import com.example.ejercicioConRoi.persistance.database.mappers.PersonaMapper;
import com.example.ejercicioConRoi.services.PersonaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService {
    private DireccionMapper direccionMapper;
    private PersonaMapper personaMapper;

    public PersonaServiceImpl(PersonaMapper personaMapper,DireccionMapper direccionMapper) {
        this.personaMapper = personaMapper;
        this.direccionMapper = direccionMapper;
    }

    @Override
    @Transactional
    public Persona addPersona(Persona persona) throws RequiredMissingFieldException, WrongLengthFieldException {
        this.validatePersonaData(persona);

        persona = this.addPersonaDireccion(persona);
        this.personaMapper.insertPersona(persona);
        return persona;
    }
    private Persona addPersonaDireccion(Persona persona){
        this.direccionMapper.insertDireccion(persona.getDireccionDomicilio());
        if(persona.isDireccionDomicilioSameAsNotificacion()){
            persona.setDireccionNotificacion(persona.getDireccionDomicilio());
        }else{
            this.direccionMapper.insertDireccion(persona.getDireccionNotificacion());
        }
        return persona;
    }

    private void validatePersonaData(Persona persona) throws RequiredMissingFieldException, WrongLengthFieldException {
        this.validateNombre(persona);
    }
    private void validateNombre(Persona persona) throws RequiredMissingFieldException, WrongLengthFieldException {
        if(persona.getNombre() == null || persona.getNombre().isEmpty()){
            throw new RequiredMissingFieldException();
        }
        if(persona.getNombre().length()>50){
            throw new WrongLengthFieldException();
        }
    }
}
