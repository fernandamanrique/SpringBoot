package com.asesoftware.semilla.EjercicioSpringBoot.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "servicios")
public class ServiciosEntity {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id_servicio")
	private Integer id_servicio;
	
	@Column(name = "id_comercio")
	private Integer id_comercio;
	
	@Column(name = "nom_servicio")
	private String nom_servicio;
	
	@Column(name = "hora_apertura")
	private String hora_apertura;
	
	@Column(name = "hora_cierre")
	private String hora_cierre;
	 
	@Column(name = "duracion")
	private String duracion;

	@OneToMany(mappedBy = "id_servicio")
	private List<TurnoEntity> turnos;
	
}

