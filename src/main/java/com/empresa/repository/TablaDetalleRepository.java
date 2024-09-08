package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.empresa.entity.TablaDetalle;



public interface TablaDetalleRepository extends JpaRepository<TablaDetalle, Integer> {
	
	@Query(" SELECT td FROM TablaDetalle td "
			+ " INNER JOIN Tabla t ON t.codTabla = td.tabla.codTabla "
			+ " where t.nombreTabla = :nombreTabla  ")
	List<TablaDetalle> buscarTablaDetalle(@Param("nombreTabla") String nombreTabla);

}
