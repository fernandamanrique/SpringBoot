package com.asesoftware.semilla.EjercicioSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.asesoftware.semilla.EjercicioSpringBoot.controller.dto.ComerciosDTO;
import com.asesoftware.semilla.EjercicioSpringBoot.controller.dto.ResponseDTO;
import com.asesoftware.semilla.EjercicioSpringBoot.service.IComerciosService;

@RestController
@RequestMapping(path = "/api/v1/comercios")
public class ComerciosController {
	
	@Autowired
	private IComerciosService comerciosService;
	
	///listar todo
	
	@GetMapping(path = "/all")
	public ResponseDTO getAll(){
		return  comerciosService.geAll();
	}	

	//listar uno
	
	@GetMapping(path = "/comercios/{id_comercio}")
	public ResponseDTO getComerciosById(@PathVariable Integer id_comercio) {
		return comerciosService.getComerciosById(id_comercio);
	}
	
	@GetMapping(path = "/parametro")
	public ResponseDTO getComerciosParametroById(@RequestParam Integer id_comercio) {
		return comerciosService.getComerciosById(id_comercio);
		
	}
	
	///crear
	@PostMapping(path = "/crear",consumes = "application/json",produces = "application/json")
	public ResponseDTO createComercios(@RequestBody ComerciosDTO comercioDTO) {
		return comerciosService.createComercios(comercioDTO);
	}
	
	///editar
	@PostMapping(path = "/editar",consumes = "application/json",produces = "application/json")
	public ResponseDTO editarComercios(@RequestBody ComerciosDTO comercioDTO) {
		return comerciosService.updateComercios(comercioDTO);
	}
	
	///eliminar
	@GetMapping(path = "/delete/{id_comercio}")
	public ResponseDTO eliminarComercios(@PathVariable Integer id_comercio){
		return comerciosService.deleteComercios(id_comercio);
	}
	
	//buscar por id
	@GetMapping(path = "/{id_comercio}")
	public ResponseDTO buscarPorId(@PathVariable Integer id_comercio){
		return comerciosService.buscarPorId(id_comercio);
	}

}
