package com.example.demo.entity.ejercicio02;

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

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "persona_esposas")
@EqualsAndHashCode
public class PersonaEsposaEntity implements Serializable {



	private static final long serialVersionUID = -5041894238191372861L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Long id;

	private String nombre;
	
	@JsonIgnore // Para evitar bucles
	@ManyToOne
	@JoinColumn(name = "persona_id", nullable = false)
	private PersonaEntity persona;

	
	

}
