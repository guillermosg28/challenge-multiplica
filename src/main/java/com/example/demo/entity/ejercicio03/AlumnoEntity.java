package com.example.demo.entity.ejercicio03;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name = "alumnos")
@EqualsAndHashCode
public class AlumnoEntity implements Serializable {

	private static final long serialVersionUID = -929624262976061033L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Long id;

	@Column(name = "first_name")
	private String first_name;

	private String last_name;
	private String date_of_birth;
	private double lat;
	private double lon;
	private int dogs;
	private int cats;
	private int indoors;
	private int outdoors;
	private int sports;
	private int stem;
	
	public AlumnoEntity(String first_name, String last_name, String date_of_birth, double lat, double lon, int dogs,
			int cats, int indoors, int outdoors, int sports, int stem) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.date_of_birth = date_of_birth;
		this.lat = lat;
		this.lon = lon;
		this.dogs = dogs;
		this.cats = cats;
		this.indoors = indoors;
		this.outdoors = outdoors;
		this.sports = sports;
		this.stem = stem;
	}
	
	public int edad() {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNac = LocalDate.parse(this.date_of_birth, fmt);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
		return periodo.getYears();
	}

	

}
