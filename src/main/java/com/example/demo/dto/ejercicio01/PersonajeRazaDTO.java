package com.example.demo.dto.ejercicio01;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonajeRazaDTO implements Serializable{
	
	private static final long serialVersionUID = -4165641643655313960L;
	
	private Long id;
	
	@JsonIgnore
	private PersonajeDTO personaje;
	
	private RazaDTO raza;

}
