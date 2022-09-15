package com.example.demo.controller.ejercicio02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ejercicio02.PersonaDTO;
import com.example.demo.service.ejercicio02.PersonaService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/personas")
public class PersonaREST {

	
	@Autowired
	private PersonaService personaService;
	
	
	@GetMapping("/donantes")
	public ResponseEntity<?> donantes() {
		try {
			List<PersonaDTO> personas = personaService.donantes();
			return ResponseEntity.ok(personas);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.internalServerError().build();
		}
	}
	
}
