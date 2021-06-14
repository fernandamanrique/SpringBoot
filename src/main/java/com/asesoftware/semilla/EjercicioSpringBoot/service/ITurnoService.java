package com.asesoftware.semilla.EjercicioSpringBoot.service;

import com.asesoftware.semilla.EjercicioSpringBoot.controller.dto.ResponseDTO;

public interface ITurnoService {
	
	public ResponseDTO getAll();
	
	public ResponseDTO getTurnoById(Integer id_turno);
	
	public ResponseDTO getTurnoParametroById(Integer id_turno);
	
	public ResponseDTO buscarPorId(Integer id_turno);

	//public ResponseDTO consultarTodosCreador(Integer id_servicio);
	
	//public ResponseDTO consultarTodosNombre(String nom_servicio);
	
	
	    
}
