package com.asesoftware.semilla.EjercicioSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.asesoftware.semilla.EjercicioSpringBoot.entity.TurnoEntity;

public interface ITurnoRepository extends JpaRepository<TurnoEntity, Integer>{

}
