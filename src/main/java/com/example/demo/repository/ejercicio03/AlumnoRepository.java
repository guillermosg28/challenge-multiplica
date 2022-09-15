package com.example.demo.repository.ejercicio03;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.ejercicio03.AlumnoEntity;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface AlumnoRepository extends JpaRepository<AlumnoEntity, Long>{

}

