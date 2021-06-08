package com.asesoftware.semilla.EjercicioSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesoftware.semilla.EjercicioSpringBoot.entity.ServiciosEntity;

public interface IServicioRepository extends JpaRepository<ServiciosEntity, Integer>{


}
