package com.empresa.service;

import java.util.List;

import com.empresa.entity.EstadosRegistro;

public interface EstadosRegistroService {
	public abstract EstadosRegistro guardarEstadosRegistro(EstadosRegistro obj);
	public abstract List<EstadosRegistro> cargarEstadosRegistro();
}
