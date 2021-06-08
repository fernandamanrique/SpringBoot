package com.asesoftware.semilla.EjercicioSpringBoot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.semilla.EjercicioSpringBoot.entity.TurnoEntity;
import com.asesoftware.semilla.EjercicioSpringBoot.service.ITurnoService;

@RestController
@RequestMapping(path = "/api/v1/turno")
public class TurnoController {
	
	@Autowired
	private ITurnoService turnoService;
		
	///listar todo
	
	@GetMapping(path = "/all")
	public List<TurnoEntity> getAll(){
		
		return turnoService.getAll();
	}
	
	///listar uno
	
	@GetMapping(path = "/turno/{id_turno}")
	public TurnoEntity getTurnoById(@PathVariable Integer id_turno) {
		return turnoService.getTurnoById(id_turno);
	}
	
	
	@GetMapping(path = "/turno")
	public TurnoEntity getTurnoParametroById(@RequestParam Integer id_turno) {
		return turnoService.getTurnoById(id_turno);
	}

}
