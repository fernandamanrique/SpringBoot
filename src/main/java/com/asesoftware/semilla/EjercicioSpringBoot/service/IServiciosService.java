package com.asesoftware.semilla.EjercicioSpringBoot.service;

import java.util.List;

import com.asesoftware.semilla.EjercicioSpringBoot.entity.ServiciosEntity;

public interface IServiciosService {
	
	public List<ServiciosEntity> geAll();
	
	public ServiciosEntity getServiciosById(Integer id_servicio);
	
	public ServiciosEntity createServicios(ServiciosEntity serviciosEntity);
	
	public ServiciosEntity updateServicios(ServiciosEntity serviciosEntity);
	
	public void deleteServicios(Integer id_servicio);
	

}
