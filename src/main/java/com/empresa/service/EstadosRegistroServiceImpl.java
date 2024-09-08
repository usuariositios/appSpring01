package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.EstadosRegistro;
import com.empresa.repository.EstadosRegistroRepository;

@Service
public class EstadosRegistroServiceImpl implements EstadosRegistroService {
	@Autowired
	private EstadosRegistroRepository estadosRegistroRepository;//autowired spring hace new al repository

	@Override
	public EstadosRegistro guardarEstadosRegistro(EstadosRegistro obj) {
		
		return estadosRegistroRepository.save(obj);
	}

	@Override
	public List<EstadosRegistro> cargarEstadosRegistro() {		
		return estadosRegistroRepository.findAll();
	}
}