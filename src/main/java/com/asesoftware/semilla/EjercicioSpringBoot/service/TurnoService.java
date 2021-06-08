package com.asesoftware.semilla.EjercicioSpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesoftware.semilla.EjercicioSpringBoot.entity.TurnoEntity;
import com.asesoftware.semilla.EjercicioSpringBoot.repository.ITurnoRepository;

@Service
public class TurnoService implements ITurnoService {
	
	@Autowired
	private ITurnoRepository turnoRepository;
	

	@Override
	public List<TurnoEntity> getAll() {
		
		return turnoRepository.findAll();
	}

	@Override
	public TurnoEntity getTurnoById(Integer id_turno) {
		
	Optional<TurnoEntity> optional= turnoRepository.findById(id_turno);
	
	
	if (optional.isPresent()) {
		
		return optional.get();
		
	}else {
		
		return null;
	}
		
	}



}
