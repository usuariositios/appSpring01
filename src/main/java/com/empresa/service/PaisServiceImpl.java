package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Pais;
import com.empresa.repository.PaisRepository;

@Service
public class PaisServiceImpl implements PaisService {
	
	@Autowired
	private PaisRepository paisRepository;//autowired spring hace new al repository

	@Override
	public Pais guardarPais(Pais obj) {
		// TODO Auto-generated method stub
		return paisRepository.save(obj);
	}

	@Override
	public List<Pais> cargarPais() {
		// TODO Auto-generated method stub		
		return paisRepository.findAll();
	}
	
	

}
