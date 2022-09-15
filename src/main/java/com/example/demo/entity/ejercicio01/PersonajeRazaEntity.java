package com.example.demo.entity.ejercicio01;

import java.io.Serializable;

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
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "personaje_razas")
@EqualsAndHashCode
public class PersonajeRazaEntity implements Serializable{
	
	private static final long serialVersionUID = 4750167038614668541L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Long id;
	
	@JsonIgnore // Para evitar bucles
	@ManyToOne
	@JoinColumn(name = "personaje_id", nullable = false)
	private PersonajeEntity personaje;
	
	@ManyToOne
	@JoinColumn(name = "raza_id", nullable = false)
	private RazaEntity raza;

}
