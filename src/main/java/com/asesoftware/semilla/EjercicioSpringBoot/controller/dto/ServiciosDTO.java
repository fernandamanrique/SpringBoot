package com.asesoftware.semilla.EjercicioSpringBoot.controller.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class ServiciosDTO {
	
	private Integer identificador_servicio;
		
	private Integer identificador_comercio;

	private String nombre_servicio;

	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern ="HH:mm:ss",timezone = "America/New_York")
	private Date hora_apertura;
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern ="HH:mm:ss",timezone = "America/New_York")
	private Date hora_cierre;
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern ="HH:mm:ss",timezone = "America/New_York") 
	private Date duracion;
	
	private List<TurnoDTO> turnos;


}
