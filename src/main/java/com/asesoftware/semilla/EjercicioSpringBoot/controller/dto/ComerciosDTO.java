package com.asesoftware.semilla.EjercicioSpringBoot.controller.dto;


import java.util.List;

import lombok.Data;

@Data
public class ComerciosDTO {
	
	private Integer identificador_comercio;	
	private String nombre_comercio;	
	private Integer aforo_maximo;
	private List<ServiciosDTO> servicios;

}
