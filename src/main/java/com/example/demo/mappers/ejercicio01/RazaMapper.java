package com.example.demo.mappers.ejercicio01;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dto.ejercicio01.RazaDTO;
import com.example.demo.entity.ejercicio01.RazaEntity;

import static java.util.Objects.isNull;


@Component
public class RazaMapper {
	
	@Autowired
	private TipoMapper tipoMapper;
	
	public RazaDTO toDTO(RazaEntity razaEntity) {		

		if(razaEntity==null) {
			return null;
		}
		RazaDTO razaDTO = new RazaDTO();
		BeanUtils.copyProperties(razaEntity,razaDTO);
		razaDTO.setTipo(tipoMapper.toDTO(razaEntity.getTipo()));
		
		return razaDTO;
	}
	
	public RazaEntity toEntity(RazaDTO razaDTO) {
		if(isNull(razaDTO)) {
			return null;
		}
		RazaEntity razaEntity= new RazaEntity();
		BeanUtils.copyProperties(razaDTO,razaEntity);
		return razaEntity;
	}

}
