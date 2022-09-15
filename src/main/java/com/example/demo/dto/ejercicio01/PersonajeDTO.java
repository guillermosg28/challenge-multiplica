package com.example.demo.dto.ejercicio01;

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
public class PersonajeDTO implements Serializable{
	
	private static final long serialVersionUID = 8082194160489220561L;

	private Long id;
	
	private String nombre;
	
	private List<PersonajeRazaDTO> razas;

}
