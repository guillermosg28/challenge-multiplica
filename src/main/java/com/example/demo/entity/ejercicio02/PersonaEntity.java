package com.example.demo.entity.ejercicio02;

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
@Table(name = "personas")
@EqualsAndHashCode
public class PersonaEntity implements Serializable {

	private static final long serialVersionUID = -5039455641109779164L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Long id;

	private String nombre;

	private Boolean donacion;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "persona", cascade = CascadeType.ALL)
	private List<PersonaEsposaEntity> esposas;

	public PersonaEntity(String nombre, Boolean donacion) {
		super();
		this.nombre = nombre;
		this.donacion = donacion;
	}

	public int calcular() {
		int contador = 0;
		
		for(int i = 0; i<esposas.size(); i++) {
			if (esposas.get(i).getNombre().charAt(0) == 'Y' || esposas.get(i).getNombre().charAt(0) == 'N') {
				 contador = contador + 1;
			}
		}
		return contador;
	}

}
