package com.example.demo.dto.ejercicio02;

import java.io.Serializable;

import java.util.List;

import lombok.AllArgsConstructor;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonaDTO implements Serializable{
	
	private static final long serialVersionUID = 7147311249307359759L;

	private Long id;
	
	private String nombre;
	
	private Boolean donacion;
	
	private List<PersonaEsposaDTO> esposas;

}
