package com.example.demo.controller.ejercicio03;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.example.demo.service.ejercicio03.AlumnoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/alumnos")
public class AlumnoREST {
	
	@Autowired
	private AlumnoService alumnoService;
	
	
	@PostMapping("/compatibilidad")
	public ResponseEntity<?> compatibilidad(@RequestBody Map<String, String> json) {
		try {
			float compatibilidad = alumnoService.compatibilidad(Integer.parseInt(json.get("alumnoUno")),Integer.parseInt(json.get("alumnoDos")));
			Map<String, String> body = new HashMap<>();
	        body.put("compatibilidad", String.valueOf(compatibilidad));
	        return new ResponseEntity<>(body, HttpStatus.OK);
	        
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.internalServerError().build();
		}
	}

}
