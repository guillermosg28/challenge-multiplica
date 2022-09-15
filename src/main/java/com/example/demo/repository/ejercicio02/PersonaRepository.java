package com.example.demo.repository.ejercicio02;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.ejercicio02.PersonaEntity;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity, Long>{

}

