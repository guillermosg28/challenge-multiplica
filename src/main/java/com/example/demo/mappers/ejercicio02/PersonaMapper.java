package com.example.demo.mappers.ejercicio02;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dto.ejercicio02.PersonaDTO;
import com.example.demo.dto.ejercicio02.PersonaEsposaDTO;
import com.example.demo.entity.ejercicio02.PersonaEntity;

import static java.util.Objects.isNull;

import java.util.ArrayList;

@Component
public class PersonaMapper {

	@Autowired
	private PersonaEsposaMapper personaEsposaMapper;

	public PersonaDTO toDTO(PersonaEntity personaEntity) {

		if (personaEntity == null) {
			return null;
		}
		if (personaEntity.getEsposas() == null) {
			
			return null;
		}
		
		PersonaDTO personaDTO = new PersonaDTO();
		BeanUtils.copyProperties(personaEntity, personaDTO);

		personaDTO.setEsposas(new ArrayList<>());
		
		 personaEntity.getEsposas().forEach(pd -> {
		 PersonaEsposaDTO personaEsposaDTO = personaEsposaMapper.toDTO(pd);
		 personaEsposaDTO.setNombre(pd.getNombre());
		 personaDTO.getEsposas().add(personaEsposaDTO);
		 });

		return personaDTO;
	}

	public PersonaEntity toEntity(PersonaDTO personaDTO) {
		if (isNull(personaDTO)) {
			return null;
		}
		PersonaEntity personaEntity = new PersonaEntity();
		BeanUtils.copyProperties(personaDTO, personaEntity);

		return personaEntity;
	}

}
