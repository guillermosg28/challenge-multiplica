package com.example.demo.entity.ejercicio01;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "raza_habilidades")
public class RazaHabilidadEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Long id;
	
	
	@JsonIgnore // Para evitar bucles
	@ManyToOne
	@JoinColumn(name = "raza_id", nullable = false)
	private RazaEntity raza;
	
	@ManyToOne
	@JoinColumn(name = "habilidad_id", nullable = false)
	private HabilidadEntity habilidad;
	


}
