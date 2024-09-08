package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.empresa.entity.Tabla;

public interface TablaRepository extends JpaRepository<Tabla, Integer> {
	@Query(" SELECT t FROM Tabla t "			
			+ " where t.nombreTabla like %:nombreTabla%  ")
	List<Tabla> buscarTabla(@Param("nombreTabla") String nombreTabla);
}
