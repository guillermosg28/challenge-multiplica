package com.example.demo.dto.ejercicio02;

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
public class PersonaEsposaDTO implements Serializable{
	
	private static final long serialVersionUID = 4026869747990865236L;

	private Long id;
	
	private String nombre;
	
	@JsonIgnore
	private PersonaDTO persona;

}
