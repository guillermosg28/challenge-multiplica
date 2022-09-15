package com.example.demo.mappers.ejercicio01;

import static java.util.Objects.isNull;


import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.example.demo.dto.ejercicio01.TipoDTO;
import com.example.demo.entity.ejercicio01.TipoEntity;

@Component
public class TipoMapper {
	public 	TipoDTO toDTO(TipoEntity tipoEntity) {

		if(tipoEntity==null) {
			return null;
		}
		TipoDTO tipoDTO = new TipoDTO();
		BeanUtils.copyProperties(tipoEntity,tipoDTO);
		return tipoDTO;
	}
	
	public TipoEntity toEntity(TipoDTO tipoDTO) {
		if(isNull(tipoDTO)) {
			return null;
		}
		TipoEntity tipoEntity = new TipoEntity();
		BeanUtils.copyProperties(tipoDTO,tipoEntity);
		return tipoEntity;
	}
}
