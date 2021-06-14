package com.asesoftware.semilla.EjercicioSpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.asesoftware.semilla.EjercicioSpringBoot.controller.dto.ResponseDTO;
import com.asesoftware.semilla.EjercicioSpringBoot.entity.TurnoEntity;
import com.asesoftware.semilla.EjercicioSpringBoot.mapper.ITurnoMapper;
import com.asesoftware.semilla.EjercicioSpringBoot.repository.ITurnoRepository;

@Service
public class TurnoService implements ITurnoService {
	
	@Autowired
	private ITurnoRepository turnoRepository;
	
	@Autowired
	private ITurnoMapper mapperTurno;

	///listar Todo
	@Override
	public ResponseDTO getAll() {
		
		List<TurnoEntity> turnoEntity = turnoRepository.findAll();
		
		return new ResponseDTO(mapperTurno.listentityToDto(turnoEntity),true, "ok", HttpStatus.OK);
	}

	///listar uno
	@Override
	public ResponseDTO getTurnoById(Integer id_turno) {
	Optional<TurnoEntity> optional= turnoRepository.findById(id_turno);
	if (optional.isPresent()) {
		return new ResponseDTO(optional.get(), true, "ok", HttpStatus.OK);
	}else {
		return new ResponseDTO(null, false, "No se encontro el Turno", HttpStatus.OK);
	}
	}
	
	@Override
	public ResponseDTO getTurnoParametroById(Integer id_turno) {
		// TODO Auto-generated method stub
		return null;

	}
	///buscar por id
		
	@Override
	public ResponseDTO buscarPorId(Integer id_turno) {
		try {
			Optional<TurnoEntity> turnoEntity = turnoRepository.findById(id_turno);
			turnoEntity.get();
			return new ResponseDTO(mapperTurno.entityToDto(turnoEntity.get()), true, "ok", HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseDTO(null, false, "No se encontro el Turno", HttpStatus.OK);
			
		}
	}

	
	


}
