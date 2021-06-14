
package com.asesoftware.semilla.EjercicioSpringBoot.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.asesoftware.semilla.EjercicioSpringBoot.controller.dto.ResponseDTO;
import com.asesoftware.semilla.EjercicioSpringBoot.controller.dto.ServiciosDTO;
import com.asesoftware.semilla.EjercicioSpringBoot.entity.ComerciosEntity;
import com.asesoftware.semilla.EjercicioSpringBoot.entity.ServiciosEntity;
import com.asesoftware.semilla.EjercicioSpringBoot.mapper.IServiciosMapper;
import com.asesoftware.semilla.EjercicioSpringBoot.repository.IServicioRepository;

@Service
public class ServiciosService implements IServiciosService{
	

	@Autowired
	private IServicioRepository serviciosRepository;

	@Autowired
	private IServiciosMapper mapperServicio;

	@Override
	public ResponseDTO geAll() {
		List<ServiciosEntity> servicioEntity =serviciosRepository.findAll();
		return new ResponseDTO(mapperServicio.listentityToDto(servicioEntity),true, "ok", HttpStatus.OK);
	}
	

	@Override
	public ResponseDTO getServiciosById(Integer id_servicio) {
		Optional<ServiciosEntity> optional = serviciosRepository.findById(id_servicio);
		if(optional.isPresent()) {
			return	new ResponseDTO(mapperServicio.entityToDto(optional.get()), true, "ok", HttpStatus.OK);	 
		}else {
			return new ResponseDTO(null, false, "No se encontro el Servicio", HttpStatus.OK);
		}
		
	}
	@Override
	public ResponseDTO getServiciosParametroById(Integer id_servicio) {
		try {
			Optional<ServiciosEntity> serviciosEntity = serviciosRepository.findById(id_servicio);
		    serviciosEntity.get();
		return new ResponseDTO(mapperServicio.entityToDto(serviciosEntity.get()), true, "ok", null) ;
		}catch (Exception e) {
			return new ResponseDTO(null, false, "No se pudo encontrar el Servicio", null) ;
		}
	}
	

	@Override
	public ResponseDTO createServicios(ServiciosDTO serviciosDTO) {
		
		try {
			ServiciosEntity serviciosEntity = mapperServicio.dtoToEntity(serviciosDTO);
			return new ResponseDTO(mapperServicio.entityToDto(serviciosRepository.save(serviciosEntity)), true, "ok", HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseDTO(null, false, "No se pudo crear el Servicio", HttpStatus.OK);
			
		}
		
		
	}

	@Override
	public ResponseDTO updateServicios(ServiciosDTO serviciosDTO) {
		
		try {
			ServiciosEntity serviciosEntity = mapperServicio.dtoToEntity(serviciosDTO);
			
			return new ResponseDTO(mapperServicio.entityToDto(serviciosRepository.save(serviciosEntity)), true, "ok", HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseDTO(null, false, "No se pudo editar el Servicio", HttpStatus.OK);
		}
			
			
		}

	@Override
	public ResponseDTO deleteServicios(Integer id_servicio) {
		
		try {
			serviciosRepository.deleteById(id_servicio);
			return new ResponseDTO(null,true, "Servicio Eliminado",HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseDTO(null,false, "El Servicio no se puede Eliminar",HttpStatus.OK);
		}
		
	}

	@Override
	public ResponseDTO buscarPorId(Integer id_servicio) {

		try {
			Optional<ServiciosEntity> servicioEntity = serviciosRepository.findById(id_servicio);
			servicioEntity.get();
			return new ResponseDTO(mapperServicio.entityToDto(servicioEntity.get()), true, "ok", HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseDTO(null, false, "No se encontro el Comercio", HttpStatus.OK);
			
		}
		
	}

	
	
	

}
