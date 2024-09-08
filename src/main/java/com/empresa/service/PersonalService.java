package com.empresa.service;

import java.util.List;

import com.empresa.entity.Personal;

public interface PersonalService {
	
	public abstract Personal guardarPersonal(Personal obj);
	public abstract List<Personal> cargarPersonal();
	public abstract List<Personal> cargarPersonal(Personal obj);

}
