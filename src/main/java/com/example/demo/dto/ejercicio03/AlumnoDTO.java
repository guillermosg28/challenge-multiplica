package com.example.demo.dto.ejercicio03;

import java.io.Serializable;

import lombok.AllArgsConstructor;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlumnoDTO implements Serializable{
	
	private static final long serialVersionUID = 7147311249307359759L;

	private Long id;
	
	private String first_name;

}
