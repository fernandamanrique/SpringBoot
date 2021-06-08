package com.asesoftware.semilla.EjercicioSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesoftware.semilla.EjercicioSpringBoot.entity.ComerciosEntity;

public interface IComerciosRepository extends JpaRepository<ComerciosEntity, Integer> {

}
