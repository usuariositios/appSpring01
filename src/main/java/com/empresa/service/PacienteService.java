package com.empresa.service;

import java.util.List;

import com.empresa.entity.Paciente;



public interface PacienteService {
	public abstract Paciente guardarPaciente(Paciente obj);
	public abstract List<Paciente> cargarPaciente();
	public abstract List<Paciente> buscarPaciente(Paciente p);

}
