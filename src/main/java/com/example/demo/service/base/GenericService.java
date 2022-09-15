package com.example.demo.service.base;

import java.util.List;

import com.example.demo.service.exceptions.ServiceException;


public interface GenericService<T> { // T, K, V...

	T findById(Long id) throws ServiceException;
	
	List<T> findByLikeObject(T t) throws ServiceException;
	
	T save(T t) throws ServiceException;
	
	T update(T t) throws ServiceException;
	
	void delete(Long id) throws ServiceException;

		
}
