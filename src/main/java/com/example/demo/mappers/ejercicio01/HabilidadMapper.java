package com.example.demo.mappers.ejercicio01;

import org.springframework.beans.BeanUtils;



import org.springframework.stereotype.Component;

import com.example.demo.dto.ejercicio01.HabilidadDTO;
import com.example.demo.entity.ejercicio01.HabilidadEntity;

import static java.util.Objects.isNull;


@Component
public class HabilidadMapper {
		
	public HabilidadDTO toDTO(HabilidadEntity habilidadEntity) {

		if(habilidadEntity==null) {
			return null;
		}
		HabilidadDTO habilidadDTO = new HabilidadDTO();
		BeanUtils.copyProperties(habilidadEntity,habilidadDTO);
		return habilidadDTO;
	}
	
	public HabilidadEntity toEntity(HabilidadDTO habilidadDTO) {
		if(isNull(habilidadDTO)) {
			return null;
		}
		HabilidadEntity habilidadEntity= new HabilidadEntity();
		BeanUtils.copyProperties(habilidadDTO,habilidadEntity);
		return habilidadEntity;
	}

}
