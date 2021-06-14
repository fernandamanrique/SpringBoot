package com.asesoftware.semilla.EjercicioSpringBoot.service;



import com.asesoftware.semilla.EjercicioSpringBoot.controller.dto.ComerciosDTO;
import com.asesoftware.semilla.EjercicioSpringBoot.controller.dto.ResponseDTO;


public interface IComerciosService {
	
	public ResponseDTO geAll();	
	
	public ResponseDTO getComerciosById(Integer id_comercio);
	public ResponseDTO getComerciosParametroById(Integer id_comercio);
	
	public ResponseDTO createComercios(ComerciosDTO comercioDTO);
	
	public ResponseDTO updateComercios(ComerciosDTO comerciosDTO);
	
	public ResponseDTO deleteComercios(Integer id_comercio);

	public ResponseDTO buscarPorId(Integer id_comercio);
	

}
