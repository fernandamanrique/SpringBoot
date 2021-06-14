package com.asesoftware.semilla.EjercicioSpringBoot.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.asesoftware.semilla.EjercicioSpringBoot.controller.dto.ResponseDTO;
import com.asesoftware.semilla.EjercicioSpringBoot.controller.dto.ServiciosDTO;
import com.asesoftware.semilla.EjercicioSpringBoot.service.IServiciosService;

@RestController
@RequestMapping(path = "/api/v1/servicios")

public class ServiciosController {
	
	@Autowired
	private IServiciosService servicioServie;
	
	///listar todo
	@GetMapping(path = "/all")
	public ResponseDTO getAll(){
		return servicioServie.geAll();
	}
	
	///listar uno
	
	@GetMapping(path = "/servicios/{id_servicio}")
	public ResponseDTO getServiciosById(@PathVariable Integer id_servicio) {
		return servicioServie.getServiciosById(id_servicio);
	}
	
	@GetMapping(path = "/parametro")
	public ResponseDTO getServiciosParametroById(@RequestParam Integer id_servicio) {
		return servicioServie.getServiciosById(id_servicio);
		
	}
	///crear
	
	@PostMapping(path = "/crear",consumes = "application/json",produces = "application/json")
	public  ResponseDTO createServicios(@RequestBody ServiciosDTO dto) {
		return servicioServie.createServicios(dto);
	}
	
	///editar
	@PostMapping(path = "/editar",consumes = "application/json",produces = "application/json")
	public  ResponseDTO editarServicios(@RequestBody ServiciosDTO serviciosDTO) {
		return servicioServie.updateServicios(serviciosDTO);
	
	}
	///eliminar
	@GetMapping(path = "/delete/{id_servicio}")
	public ResponseDTO eliminarServicios(@PathVariable Integer id_servicio){
			return servicioServie.deleteServicios(id_servicio);
		}
	
	//buscar por id
		@GetMapping(path = "/{id_servicio}")
		public ResponseDTO buscarPorId(@PathVariable Integer id_servicio){
			return servicioServie.buscarPorId(id_servicio);
		}

		
}
