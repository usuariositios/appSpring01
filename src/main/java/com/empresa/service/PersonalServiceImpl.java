package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Personal;
import com.empresa.repository.PersonalRepository;

@Service
public class PersonalServiceImpl implements PersonalService {
	@Autowired
	private PersonalRepository personalRepository;//autowired spring hace new al repository

	@Override
	public Personal guardarPersonal(Personal obj) {
		// TODO Auto-generated method stub
		return personalRepository.save(obj);
	}

	@Override
	public List<Personal> cargarPersonal() {
		// TODO Auto-generated method stub
		
		return personalRepository.findAll();
	}
	
	@Override
	public List<Personal> cargarPersonal(Personal p) {
		// TODO Auto-generated method stub
		
		return personalRepository.buscarPersona(p.getNombrePersonal(),p.getDireccionPersonal(), p.getCelularPersonal(),p.getNroCarnet(),p.getCiudad().getCodCiudad());
	}
	
	

}
