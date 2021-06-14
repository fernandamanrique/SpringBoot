package com.asesoftware.semilla.EjercicioSpringBoot.controller.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class TurnoDTO {
	
	private Integer identificador_turno;
	
	private Integer identificador_servicio;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern =" yyyy/MM/dd")
	private Date fecha_turno;
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern ="HH:mm:ss",timezone = "America/New_York")
	private Date hora_inicio;
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern ="HH:mm:ss",timezone = "America/New_York")
	private Date hora_fin;
	
	private String estado;
	

}
