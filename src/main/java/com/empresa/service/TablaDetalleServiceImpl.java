package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.TablaDetalle;
import com.empresa.repository.TablaDetalleRepository;


@Service
public class TablaDetalleServiceImpl implements TablaDetalleService {
	
	@Autowired
	private TablaDetalleRepository tablaDetalleRepository;//autowired spring hace new al repository

	@Override
	public TablaDetalle guardarTablaDetalle(TablaDetalle td) {
		
		return tablaDetalleRepository.save(td);
	}

	@Override
	public List<TablaDetalle> cargarTablaDetalle() {
		return tablaDetalleRepository.findAll();
	}

	@Override
	public List<TablaDetalle> buscarTablaDetalle(TablaDetalle td) {
		return tablaDetalleRepository.buscarTablaDetalle(td.getTabla().getNombreTabla());		
	}
	

}
