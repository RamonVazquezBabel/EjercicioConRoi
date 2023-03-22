package com.example.ejercicioConRoi.controllers;

import com.example.ejercicioConRoi.exceptions.RequiredMissingFieldException;
import com.example.ejercicioConRoi.models.Persona;
import com.example.ejercicioConRoi.services.PersonaService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    PersonaService personaService;
    PersonaController(PersonaService personaService){
        this.personaService = personaService;
    }
    @PostMapping("/persona")
    ResponseEntity addPersona(@RequestBody Persona persona){
        try {
            this.personaService.addPersona(persona);
        } catch (RequiredMissingFieldException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Comprueba los datos de entrada");
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
        return ResponseEntity.ok(String.format("persona añadida. Id: %d", persona.getPersonaId()));
    }
}
