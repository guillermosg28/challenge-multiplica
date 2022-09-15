package com.example.demo.mappers.ejercicio02;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.example.demo.dto.ejercicio02.PersonaEsposaDTO;
import com.example.demo.entity.ejercicio02.PersonaEsposaEntity;
import static java.util.Objects.isNull;


@Component
public class PersonaEsposaMapper {
	public PersonaEsposaDTO toDTO(PersonaEsposaEntity personaEsposaEntity) {
		if(personaEsposaEntity==null) {
			return null;
		}
		PersonaEsposaDTO personaEsposaDTO = new PersonaEsposaDTO();
		BeanUtils.copyProperties(personaEsposaEntity,personaEsposaDTO );
		return personaEsposaDTO;
	}
	
	public PersonaEsposaEntity toEntity(PersonaEsposaDTO personaEsposaDTO) {
		if(isNull(personaEsposaDTO)) {
			return null;
		}
		PersonaEsposaEntity personaEsposaEntity= new PersonaEsposaEntity();
		BeanUtils.copyProperties(personaEsposaDTO,personaEsposaEntity);
		return personaEsposaEntity;
	}
}
