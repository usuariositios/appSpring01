package com.empresa.service;

import java.util.List;

import com.empresa.entity.TablaDetalle;



public interface TablaDetalleService  {
	public abstract TablaDetalle guardarTablaDetalle(TablaDetalle td);
	public abstract List<TablaDetalle> cargarTablaDetalle();
	public abstract List<TablaDetalle> buscarTablaDetalle(TablaDetalle td);

}
