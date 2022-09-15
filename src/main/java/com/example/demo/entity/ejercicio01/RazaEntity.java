package com.example.demo.entity.ejercicio01;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "razas")
public class RazaEntity implements Serializable {
	
	private static final long serialVersionUID = 2639284959935283556L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Long id;

	private String nombre;
	
	@OneToOne
    @JoinColumn(name = "tipo_id", nullable = false)
	private TipoEntity tipo;
	
	private Boolean principal;
	
	

}
