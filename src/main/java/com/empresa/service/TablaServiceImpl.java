package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Tabla;
import com.empresa.repository.TablaRepository;

@Service
public class TablaServiceImpl implements TablaService {
	
	@Autowired
	private TablaRepository tablaRepository;//autowired spring hace new al repository

	@Override
	public Tabla guardarTabla(Tabla t) {		
		return tablaRepository.save(t);
	}

	@Override
	public List<Tabla> cargarTabla() {		
		return tablaRepository.findAll();
	}
	
	@Override
	public List<Tabla> buscarTabla(Tabla t) {		
		return tablaRepository.buscarTabla(t.getNombreTabla());
	}
	
	

}
