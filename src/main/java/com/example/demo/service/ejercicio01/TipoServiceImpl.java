package com.example.demo.service.ejercicio01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ejercicio01.TipoDTO;
import com.example.demo.entity.ejercicio01.TipoEntity;
import com.example.demo.mappers.ejercicio01.TipoMapper;
import com.example.demo.repository.ejercicio01.TipoRepository;
import com.example.demo.service.exceptions.ServiceException;

@Service
public class TipoServiceImpl implements TipoService {
	
	@Autowired
	private TipoRepository tipoRepository;
	
	@Autowired
	private TipoMapper tipoMapper;

	@Override
	public TipoDTO findById(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoDTO> findByLikeObject(TipoDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoDTO save(TipoDTO tipoDTO) throws ServiceException {
		try {
			TipoEntity tipoEntity = tipoMapper.toEntity(tipoDTO);

			tipoRepository.save(tipoEntity);
			
			return tipoMapper.toDTO(tipoEntity);
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public TipoDTO update(TipoDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

}
