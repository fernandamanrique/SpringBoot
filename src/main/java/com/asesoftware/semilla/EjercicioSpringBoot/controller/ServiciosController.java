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

import com.asesoftware.semilla.EjercicioSpringBoot.entity.ServiciosEntity;
import com.asesoftware.semilla.EjercicioSpringBoot.service.IServiciosService;

@RestController
@RequestMapping(path = "/api/v1/servicios")

public class ServiciosController {
	
	@Autowired
	private IServiciosService servicioServie;
	
	///listar todo
	@GetMapping(path = "/all")
	public List<ServiciosEntity> getAll(){
		return servicioServie.geAll();
	}
	
	///listar uno
	
	@GetMapping(path = "/servicios/{id_servicio}")
	public ServiciosEntity getServiciosById(@PathVariable Integer id_servicio) {
		return servicioServie.getServiciosById(id_servicio);
	}
	
	@GetMapping(path = "/servicios")
	public ServiciosEntity getServiciosParametroById(@RequestParam Integer id_servicio) {
		return servicioServie.getServiciosById(id_servicio);
		
	}
	///crear
	
	@PostMapping(path = "/crear",consumes = "application/json",produces = "application/json")
	public  ServiciosEntity createServicios(@RequestBody ServiciosEntity entity) {
		return servicioServie.createServicios(entity);
	}
	///editar
	@PostMapping(path = "/editar",consumes = "application/json",produces = "application/json")
	public  ServiciosEntity editarServicios(@RequestBody ServiciosEntity entity) {
		return servicioServie.updateServicios(entity);
	
	}
	///eliminar
	@GetMapping(path = "/delete/{id_servicio}")
	public void eliminarServicios(@PathVariable Integer id_servicio){
			servicioServie.deleteServicios(id_servicio);
		}

}
