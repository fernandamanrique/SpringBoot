package com.asesoftware.semilla.EjercicioSpringBoot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.asesoftware.semilla.EjercicioSpringBoot.controller.dto.ResponseDTO;
import com.asesoftware.semilla.EjercicioSpringBoot.service.ITurnoService;

@RestController
@RequestMapping(path = "/api/v1/turno")
public class TurnoController {
	
	@Autowired
	private ITurnoService turnoService;
		
	///listar todo
	
	@GetMapping(path = "/all")
	public ResponseDTO getAll(){
		
		return turnoService.getAll();
	}
	
	///listar uno
	
	@GetMapping(path = "/turno/{id_turno}")
	public ResponseDTO getTurnoById(@PathVariable Integer id_turno) {
		return turnoService.getTurnoById(id_turno);
	}
	
	
	@GetMapping(path = "/parametro")
	public ResponseDTO getTurnoParametroById(@RequestParam Integer id_turno) {
		return turnoService.getTurnoById(id_turno);
	}

	//buscar por id
	@GetMapping(path = "/{id_turno}")
	public ResponseDTO buscarPorId(@PathVariable Integer id_turno){
		return turnoService.buscarPorId(id_turno);
	}
			
	
}
