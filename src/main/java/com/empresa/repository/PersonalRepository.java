package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.Personal;

public interface PersonalRepository extends JpaRepository<Personal, Integer>{
	@Query("SELECT p FROM Personal p "
			+ " where nombrePersonal like %:nombrePersonal% "
			+ " AND direccionPersonal like %:direccionPersonal% "
			+ " AND celularPersonal like %:celularPersonal%"
			+ " AND nroCarnet like %:nroCarnet%"
			+ " AND ciudad.codCiudad = (CASE WHEN :codCiudad>0 THEN :codCiudad ELSE ciudad.codCiudad END)  ")
	List<Personal> buscarPersona(@Param("nombrePersonal") String nombrePersonal, @Param("direccionPersonal") String direccionPersonal , @Param("celularPersonal") String celularPersonal,@Param("nroCarnet") String nroCarnet,@Param("codCiudad") int codCiudad);

}
