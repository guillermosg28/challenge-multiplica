package com.example.demo.repository.ejercicio01;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.ejercicio01.PersonajeEntity;

@Repository
public interface PersonajeRepository extends JpaRepository<PersonajeEntity, Long>{

}
