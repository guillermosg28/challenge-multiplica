package com.example.demo.service.ejercicio03;

import java.util.List;

import com.example.demo.dto.ejercicio03.AlumnoDTO;
import com.example.demo.service.base.GenericService;
import com.example.demo.service.exceptions.ServiceException;

public interface AlumnoService extends GenericService<AlumnoDTO>{
	
	List<AlumnoDTO> findAlls() throws ServiceException;
	
	float compatibilidad(int estudianteUno, int estudianteDos) throws ServiceException;

}
