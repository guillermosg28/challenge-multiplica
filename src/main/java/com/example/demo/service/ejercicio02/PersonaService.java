package com.example.demo.service.ejercicio02;


import java.util.List;


import com.example.demo.dto.ejercicio02.PersonaDTO;
import com.example.demo.service.base.GenericService;
import com.example.demo.service.exceptions.ServiceException;

public interface PersonaService extends GenericService<PersonaDTO>{
	
	List<PersonaDTO> donantes() throws ServiceException;

}
