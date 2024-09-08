package com.empresa.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.Paciente;
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
	@Query("SELECT p FROM Paciente p "
			+ " where p.personal.nombrePersonal like %:nombrePersonal% "
			+ " AND p.personal.direccionPersonal like %:direccionPersonal% "
			+ " AND p.personal.celularPersonal like %:celularPersonal%"
			+ " AND p.personal.nroCarnet like %:nroCarnet%"
			+ " AND p.personal.ciudad.codCiudad = (CASE WHEN :codCiudad>0 THEN :codCiudad ELSE p.personal.ciudad.codCiudad END)  ")
	List<Paciente> buscarPaciente(@Param("nombrePersonal") String nombrePersonal, 
								 @Param("direccionPersonal") String direccionPersonal , 
								 @Param("celularPersonal") String celularPersonal,
								 @Param("nroCarnet") String nroCarnet,
								 @Param("codCiudad") int codCiudad);

}
