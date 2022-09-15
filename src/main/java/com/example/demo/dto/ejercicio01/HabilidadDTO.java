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
public class HabilidadDTO implements Serializable{
	
	private static final long serialVersionUID = -9056009504465786152L;

	private Long id;
	
	private String nombre;

}
