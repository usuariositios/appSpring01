package com.empresa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Paciente;
import com.empresa.repository.PacienteRepository;
import com.empresa.repository.PersonalRepository;

@Service
@Transactional//todos los metodos ya son transaccionales
public class PacienteServiceImpl implements PacienteService {
	@Autowired
	private PacienteRepository pacienteRepository;//autowired spring hace new al repository
	
	@Autowired
	private PersonalRepository personalRepository;//autowired spring hace new al repository

	@Override
	public Paciente guardarPaciente(Paciente obj) {
		personalRepository.save(obj.getPersonal());
		return pacienteRepository.save(obj);
	}

	@Override
	public List<Paciente> cargarPaciente() {
		return pacienteRepository.findAll();
	}
	@Override
	public List<Paciente> buscarPaciente(Paciente p) {
		return pacienteRepository.buscarPaciente(p.getPersonal().getNombrePersonal(), 
				p.getPersonal().getDireccionPersonal(),
				p.getPersonal().getCelularPersonal(),
				p.getPersonal().getNroCarnet(),
				p.getPersonal().getCiudad().getCodCiudad());
	}
}
