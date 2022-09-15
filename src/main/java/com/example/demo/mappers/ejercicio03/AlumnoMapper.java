package com.example.demo.mappers.ejercicio03;

import org.springframework.beans.BeanUtils;

import org.springframework.stereotype.Component;

import com.example.demo.dto.ejercicio03.AlumnoDTO;
import com.example.demo.entity.ejercicio03.AlumnoEntity;

import static java.util.Objects.isNull;


@Component
public class AlumnoMapper {
	
	public AlumnoDTO toDTO(AlumnoEntity alumnoEntity) {

		if(alumnoEntity==null) {
			return null;
		}
		AlumnoDTO alumnoDTO = new AlumnoDTO();
		BeanUtils.copyProperties(alumnoEntity,alumnoDTO );
		return alumnoDTO;
	}
	
	public AlumnoEntity toEntity(AlumnoDTO alumnoDTO) {
		if(isNull(alumnoDTO)) {
			return null;
		}
		AlumnoEntity alumnoEntity= new AlumnoEntity();
		BeanUtils.copyProperties(alumnoDTO,alumnoEntity);
		return alumnoEntity;
	}

}
