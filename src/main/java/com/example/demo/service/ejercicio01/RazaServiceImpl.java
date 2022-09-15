package com.example.demo.service.ejercicio01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ejercicio01.RazaDTO;
import com.example.demo.entity.ejercicio01.RazaEntity;
import com.example.demo.mappers.ejercicio01.RazaMapper;
import com.example.demo.repository.ejercicio01.RazaRepository;
import com.example.demo.service.exceptions.ServiceException;

@Service
public class RazaServiceImpl implements RazaService{

	@Autowired
	private RazaRepository razaRepository;
	
	@Autowired
	private RazaMapper razaMapper;
	
	@Override
	public RazaDTO findById(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RazaDTO> findByLikeObject(RazaDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RazaDTO save(RazaDTO razaDTO) throws ServiceException {
		try {
			RazaEntity razaEntity = razaMapper.toEntity(razaDTO);

			razaRepository.save(razaEntity);
			return razaMapper.toDTO(razaEntity);
		}catch (Exception e) {
			throw new ServiceException(e);
		}
		
	}

	@Override
	public RazaDTO update(RazaDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

}
