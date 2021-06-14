package com.asesoftware.semilla.EjercicioSpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.asesoftware.semilla.EjercicioSpringBoot.controller.dto.ComerciosDTO;
import com.asesoftware.semilla.EjercicioSpringBoot.controller.dto.ResponseDTO;
import com.asesoftware.semilla.EjercicioSpringBoot.entity.ComerciosEntity;
import com.asesoftware.semilla.EjercicioSpringBoot.mapper.IComerciosMapper;
import com.asesoftware.semilla.EjercicioSpringBoot.repository.IComerciosRepository;

@Service
public class ComerciosService implements IComerciosService {
	
	@Autowired
	private IComerciosRepository comerciosRepository;

	@Autowired
	private IComerciosMapper mapperComercio;

	
	@Override
	public ResponseDTO geAll() {
		
		List<ComerciosEntity> comercioEntity = comerciosRepository.findAll();
		
		return new ResponseDTO(mapperComercio.listentityToDto(comercioEntity),true, "ok", HttpStatus.OK);
	}
	
	@Override
	public ResponseDTO getComerciosById(Integer id_comercio) {
		Optional<ComerciosEntity> optional= comerciosRepository.findById(id_comercio);
		if (optional.isPresent()) {
			return new ResponseDTO(mapperComercio.entityToDto(optional.get()), true, "ok", HttpStatus.OK);
		}else {
			return new ResponseDTO(null, false, "No se encontro el Comercio", HttpStatus.OK);		
		}		
	}
	
	@Override
	public ResponseDTO getComerciosParametroById(Integer id_comercio) {
		try {
			Optional<ComerciosEntity> comerciosEntity = comerciosRepository.findById(id_comercio);
		    comerciosEntity.get();
		return new ResponseDTO(mapperComercio.entityToDto(comerciosEntity.get()), true, "ok", null) ;
		}catch (Exception e) {
			return new ResponseDTO(null, false, "No se pudo encontrar el comercio", null) ;
		}
		
	}
	
	@Override
	public ResponseDTO createComercios(ComerciosDTO comerciosDTO) {
		
		try {
			ComerciosEntity comerciosEntity = mapperComercio.dtoToEntity(comerciosDTO);
			return new ResponseDTO(mapperComercio.entityToDto(comerciosRepository.save(comerciosEntity)), true, "ok", HttpStatus.OK);
			
		}catch(Exception e) {
			return new ResponseDTO(null, false, "No se pudo crear el Comercio", HttpStatus.OK);
			
		}
		
	}

	@Override
	public ResponseDTO updateComercios(ComerciosDTO comerciosDTO) {
		try {
			ComerciosEntity comerciosEntity = mapperComercio.dtoToEntity(comerciosDTO);
			return new ResponseDTO(mapperComercio.entityToDto(comerciosRepository.save(comerciosEntity)), true, "ok", HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseDTO(null, false, "No se pudo editar el Comercio", HttpStatus.OK);
			
		}
		
	
	}

	@Override
	public ResponseDTO deleteComercios(Integer id_comercio) {
		try {
			comerciosRepository.deleteById(id_comercio);
			return new ResponseDTO(null,true, "Comercio Eliminado",HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseDTO(null,false, "El Comercio no se puede Eliminar",HttpStatus.OK);
		}
		
	}

	@Override
	public ResponseDTO buscarPorId(Integer id_comercio) {
		
		try {
			Optional<ComerciosEntity> comerciosEntity = comerciosRepository.findById(id_comercio);
			comerciosEntity.get();
			return new ResponseDTO( mapperComercio.entityToDto(comerciosEntity.get()), true, "ok", HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseDTO(null, false, "No se encontro el Comercio", HttpStatus.OK);
			
		}
		
	}


	
	
	
	

}
