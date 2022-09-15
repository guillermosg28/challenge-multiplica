package com.example.demo.service.ejercicio01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ejercicio01.HabilidadDTO;
import com.example.demo.entity.ejercicio01.HabilidadEntity;
import com.example.demo.mappers.ejercicio01.HabilidadMapper;
import com.example.demo.repository.ejercicio01.HabilidadRepository;
import com.example.demo.service.exceptions.ServiceException;

@Service
public class HabilidadServiceImpl implements HabilidadService{

	@Autowired
	private HabilidadRepository habilidadRepository;
	
	@Autowired
	private HabilidadMapper habilidadMapper;
	
	@Override
	public HabilidadDTO findById(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HabilidadDTO> findByLikeObject(HabilidadDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HabilidadDTO save(HabilidadDTO habilidadDTO) throws ServiceException {
		try {
			HabilidadEntity habilidadEntity = habilidadMapper.toEntity(habilidadDTO);

			habilidadRepository.save(habilidadEntity);
			
			return habilidadMapper.toDTO(habilidadEntity);
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public HabilidadDTO update(HabilidadDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

}
