package com.example.demo.entity.ejercicio01;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
@Table(name = "personajes")
@EqualsAndHashCode
public class PersonajeEntity implements Serializable {
	
	private static final long serialVersionUID = 6854314559379135349L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Long id;

	private String nombre;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "personaje", cascade = CascadeType.ALL)
	private List<PersonajeRazaEntity> razas;

}
