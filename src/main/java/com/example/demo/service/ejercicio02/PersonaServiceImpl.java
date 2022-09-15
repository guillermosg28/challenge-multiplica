package com.example.demo.service.ejercicio02;

import java.util.ArrayList;

import java.util.List;


import java.util.stream.Collectors;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ejercicio02.PersonaDTO;
import com.example.demo.entity.ejercicio02.PersonaEntity;
import com.example.demo.entity.ejercicio02.PersonaEsposaEntity;
import com.example.demo.mappers.ejercicio02.PersonaEsposaMapper;
import com.example.demo.mappers.ejercicio02.PersonaMapper;
import com.example.demo.repository.ejercicio02.PersonaRepository;
import com.example.demo.service.exceptions.ServiceException;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaMapper personaMapper;

	@Autowired
	private PersonaEsposaMapper personaEsposaMapper;

	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public PersonaDTO findById(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonaDTO> findByLikeObject(PersonaDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonaDTO save(PersonaDTO personaDTO) throws ServiceException {
		try {
			PersonaEntity personaEntity = personaMapper.toEntity(personaDTO);

			List<PersonaEsposaEntity> listPersonaEsposaEntity = new ArrayList<>();

			personaDTO.getEsposas().forEach(dp -> {
				PersonaEsposaEntity personaEsposaEntity = personaEsposaMapper.toEntity(dp);
				personaEsposaEntity.setPersona(personaEntity);
				listPersonaEsposaEntity.add(personaEsposaEntity);
			});

			personaEntity.setEsposas(listPersonaEsposaEntity);

			personaRepository.save(personaEntity);
			return personaMapper.toDTO(personaEntity);
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public PersonaDTO update(PersonaDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<PersonaDTO> donantes() throws ServiceException {
		try {
			List<PersonaEntity> lstPersonaEntities = personaRepository.findAll();

			List<PersonaEntity> donantes = new ArrayList<>();

			lstPersonaEntities.forEach(persona -> {
				if (persona.getDonacion() && persona.calcular() > 0) {
					donantes.add(persona);
				}
			});

			return donantes.stream().map(c -> personaMapper.toDTO(c)).collect(Collectors.toList());
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}

}
