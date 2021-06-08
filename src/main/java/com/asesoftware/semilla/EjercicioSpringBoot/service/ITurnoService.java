package com.asesoftware.semilla.EjercicioSpringBoot.service;

import java.util.List;

import com.asesoftware.semilla.EjercicioSpringBoot.entity.TurnoEntity;

public interface ITurnoService {
	
	public List<TurnoEntity> getAll();
	
	public TurnoEntity getTurnoById(Integer id_turno);

	
	    
}
