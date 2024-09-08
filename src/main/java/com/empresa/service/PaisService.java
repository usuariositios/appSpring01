package com.empresa.service;

import java.util.List;

import com.empresa.entity.Pais;

public interface PaisService {
	public abstract Pais guardarPais(Pais obj);
	public abstract List<Pais> cargarPais();

}
