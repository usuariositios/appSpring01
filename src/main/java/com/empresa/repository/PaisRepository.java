package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Pais;
//crear los mnetodos insert delete etc.
public interface PaisRepository extends JpaRepository<Pais, Integer> {
 
}
