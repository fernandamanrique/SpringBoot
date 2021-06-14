package com.asesoftware.semilla.EjercicioSpringBoot.entity;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	@Temporal(TemporalType.TIME)
	private Date hora_apertura;
	
	@Column(name = "hora_cierre")
	@Temporal(TemporalType.TIME)
	private Date hora_cierre;
	 
	@Column(name = "duracion")
	@Temporal(TemporalType.TIME)
	private Date duracion;

	@OneToMany(mappedBy = "id_servicio")
	private List<TurnoEntity> turnos;
	
}

