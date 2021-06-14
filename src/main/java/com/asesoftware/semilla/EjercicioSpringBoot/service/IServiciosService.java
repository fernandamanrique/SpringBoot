package com.asesoftware.semilla.EjercicioSpringBoot.service;



import com.asesoftware.semilla.EjercicioSpringBoot.controller.dto.ResponseDTO;
import com.asesoftware.semilla.EjercicioSpringBoot.controller.dto.ServiciosDTO;

public interface IServiciosService {
	
	public ResponseDTO geAll();
	
	public ResponseDTO getServiciosById(Integer id_servicio);
	public ResponseDTO getServiciosParametroById(Integer id_servicio);
	
	public ResponseDTO createServicios(ServiciosDTO serviciosDTO);
	
	public ResponseDTO updateServicios(ServiciosDTO serviciosDTO);
	
	public ResponseDTO deleteServicios(Integer id_servicio);

	public ResponseDTO buscarPorId(Integer id_servicio);

	

}
