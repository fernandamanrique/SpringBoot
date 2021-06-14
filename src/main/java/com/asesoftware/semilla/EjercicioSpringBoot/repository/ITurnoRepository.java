package com.asesoftware.semilla.EjercicioSpringBoot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.asesoftware.semilla.EjercicioSpringBoot.entity.TurnoEntity;

public interface ITurnoRepository extends JpaRepository<TurnoEntity, Integer>{
	
	//List<TurnoEntity> findById_servicio(Integer id_servicio);

}
