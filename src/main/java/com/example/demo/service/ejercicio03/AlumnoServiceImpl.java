package com.example.demo.service.ejercicio03;

import java.util.List;

import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ejercicio03.AlumnoDTO;
import com.example.demo.entity.ejercicio03.AlumnoEntity;
import com.example.demo.mappers.ejercicio03.AlumnoMapper;
import com.example.demo.repository.ejercicio03.AlumnoRepository;
import com.example.demo.service.exceptions.ServiceException;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoMapper alumnoMapper;

	@Autowired
	private AlumnoRepository alumnoRepository;

	@Override
	public List<AlumnoDTO> findAlls() throws ServiceException {
		try {
			List<AlumnoEntity> lstUsuarioEntities = alumnoRepository.findAll();
			return lstUsuarioEntities.stream().map(c -> alumnoMapper.toDTO(c)).collect(Collectors.toList());
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public AlumnoDTO findById(Long id) throws ServiceException {
		try {
			return null;
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public List<AlumnoDTO> findByLikeObject(AlumnoDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AlumnoDTO save(AlumnoDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AlumnoDTO update(AlumnoDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub

	}

	@Override
	public float compatibilidad(int estudianteUno, int estudianteDos) throws ServiceException {

		float d = 0;
		float ageDif = 0;
		float coincidencias = 0;
		
		//Estudiantes
		Optional<AlumnoEntity> estudianteUnoEntity = alumnoRepository.findById((long) estudianteUno);
		Optional<AlumnoEntity> estudianteDosEntity = alumnoRepository.findById((long) estudianteDos);

		// Distancia entre dos puntos
		float distancia = distancia((float) estudianteUnoEntity.get().getLat(), (float) estudianteUnoEntity.get().getLon(), (float) estudianteDosEntity.get().getLat(), (float) estudianteDosEntity.get().getLon());
		d = (float) Math.pow(Math.log10(distancia), -1);

		// Diferencia de edades
		int diferenciaEdades = estudianteUnoEntity.get().edad() - estudianteDosEntity.get().edad();
		if (diferenciaEdades <= 1) {
			ageDif = 1;
		}
		if (diferenciaEdades >= 2) {
			ageDif = (float) Math.pow(diferenciaEdades, -1);
		}

		// Suma de coincidencias
		coincidencias = coincidencias(estudianteUnoEntity, estudianteDosEntity);

		//compatibilidad
		float compatibilidad = d + ageDif + coincidencias;
		return compatibilidad;
	}

	public float distancia(float latitudUno, float longitudUno, float latitudDos, float longitudDos) {

		float constante = (float) (Math.PI / 180);
		float diferenciaLatitud = latitudUno - latitudDos;
		float diferenciaLongitud = longitudUno - longitudDos;
		float radioTierra = (float) 6378.1;

		float a = (float) (Math.pow(Math.sin(diferenciaLatitud * constante / 2), 2) + Math.cos(latitudUno * constante)
				* Math.cos(latitudDos * constante) * Math.pow(Math.sin(diferenciaLongitud * constante / 2), 2));

		float b = (float) (2 * Math.asin(Math.sqrt(a)));
		float distanciaGeografica = b * radioTierra;

		return distanciaGeografica;
	}

	public float coincidencias(Optional<AlumnoEntity> estudianteUnoEntity, Optional<AlumnoEntity> estudianteDosEntity) {

		float coincidencias = 0;

		if (estudianteUnoEntity.get().getDogs() == estudianteDosEntity.get().getDogs()) {
			coincidencias++;
		}
		if (estudianteUnoEntity.get().getCats() == estudianteDosEntity.get().getCats()) {
			coincidencias++;
		}
		if (estudianteUnoEntity.get().getIndoors() == estudianteDosEntity.get().getIndoors()) {
			coincidencias++;
		}
		if (estudianteUnoEntity.get().getOutdoors() == estudianteDosEntity.get().getOutdoors()) {
			coincidencias++;
		}
		if (estudianteUnoEntity.get().getSports() == estudianteDosEntity.get().getSports()) {
			coincidencias++;
		}
		if (estudianteUnoEntity.get().getStem() == estudianteDosEntity.get().getStem()) {
			coincidencias++;
		}
		return coincidencias;

	}

}
