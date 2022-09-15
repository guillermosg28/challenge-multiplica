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
public class RazaHabilidadDTO  implements Serializable{
	private static final long serialVersionUID = -5171312800073562423L;

	private Long id;
	
	@JsonIgnore
	private RazaDTO raza;
	
	private HabilidadDTO habilidad;
	

}
