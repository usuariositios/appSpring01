package com.empresa.service;

import java.util.List;

import com.empresa.entity.Tabla;

public interface TablaService {
	public abstract Tabla guardarTabla(Tabla t);
	public abstract List<Tabla> cargarTabla();
	public abstract List<Tabla> buscarTabla(Tabla t);

}
