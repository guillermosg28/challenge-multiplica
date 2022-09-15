package com.example.demo.dto.ejercicio01;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RazaDTO implements Serializable{
	
	private static final long serialVersionUID = 4868855055415645129L;

	private Long id;
	
	private String nombre;
		
	private TipoDTO tipo;
	
	private Boolean principal;

}
