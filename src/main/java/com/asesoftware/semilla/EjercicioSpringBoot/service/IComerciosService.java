package com.asesoftware.semilla.EjercicioSpringBoot.service;

import java.util.List;

import com.asesoftware.semilla.EjercicioSpringBoot.entity.ComerciosEntity;

public interface IComerciosService {
	
	
	public List<ComerciosEntity> geAll();
	
	public ComerciosEntity getComerciosById(Integer id_comercio);
	
	public ComerciosEntity createComercios(ComerciosEntity comerciosEntity);
	
	public ComerciosEntity updateComercios(ComerciosEntity comerciosEntity);
	
	public void deleteComercios(Integer id_comercio);
	

}
