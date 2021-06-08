package com.asesoftware.semilla.EjercicioSpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesoftware.semilla.EjercicioSpringBoot.entity.ServiciosEntity;
import com.asesoftware.semilla.EjercicioSpringBoot.repository.IServicioRepository;

@Service
public class ServiciosService implements IServiciosService{
	
	@Autowired
	private IServicioRepository serviciosRepository;

	@Override
	public List<ServiciosEntity> geAll() {
		
		return serviciosRepository.findAll();
	}

	@Override
	public ServiciosEntity getServiciosById(Integer id_servicio) {
		
		Optional<ServiciosEntity> optional = serviciosRepository.findById(id_servicio);
		
		if(optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
		
	}

	@Override
	public ServiciosEntity createServicios(ServiciosEntity serviciosEntity) {
		
		try {
			return serviciosRepository.save(serviciosEntity);
		}catch(Exception e) {
			return null;
			
		}
		
		
	}

	@Override
	public ServiciosEntity updateServicios(ServiciosEntity serviciosEntity) {
		
		return serviciosRepository.save(serviciosEntity);
	}

	@Override
	public void deleteServicios(Integer id_servicio) {
		serviciosRepository.deleteById(id_servicio);
		
		
	}

	
	
	

}
