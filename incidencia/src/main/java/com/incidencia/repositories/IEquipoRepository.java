package com.incidencia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incidencia.entities.Equipo;

@Repository
public interface IEquipoRepository extends JpaRepository<Equipo, Long> {

}
