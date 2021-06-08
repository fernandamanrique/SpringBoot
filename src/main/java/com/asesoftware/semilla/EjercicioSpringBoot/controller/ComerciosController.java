package com.asesoftware.semilla.EjercicioSpringBoot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.semilla.EjercicioSpringBoot.entity.ComerciosEntity;
import com.asesoftware.semilla.EjercicioSpringBoot.service.IComerciosService;

@RestController
@RequestMapping(path = "/api/v1/comercios")
public class ComerciosController {
	
	@Autowired
	private IComerciosService comerciosService;
	
	///listar todo
	
	@GetMapping(path = "/all")
	public List<ComerciosEntity> getAll(){
		return  comerciosService.geAll();
	}	

	//listar uno
	
	@GetMapping(path = "/comercios/{id_comercio}")
	public ComerciosEntity getComerciosById(@PathVariable Integer id_comercio) {
		return comerciosService.getComerciosById(id_comercio);
	}
	
	@GetMapping(path = "/comercios")
	public ComerciosEntity getComerciosParametroById(@RequestParam Integer id_comercio) {
		return comerciosService.getComerciosById(id_comercio);
		
	}
	
	///crear
	@GetMapping(path = "/crear",consumes = "application/json",produces = "application/json")
	public ComerciosEntity createComercios(@RequestBody ComerciosEntity entity) {
		return comerciosService.createComercios(entity);
	}
	
	///editar
	@PostMapping(path = "/editar",consumes = "application/json",produces = "application/json")
	public ComerciosEntity editarComercios(@RequestBody ComerciosEntity entity) {
		return comerciosService.updateComercios(entity);
	}
	
	///eliminar
	@GetMapping(path = "/delete/{id_comercio}")
	public void eliminarComercios(@PathVariable Integer id_comercio){
		comerciosService.deleteComercios(id_comercio);
	}
	

}
