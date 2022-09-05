package com.incidencia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incidencia.entities.Incidencia;


@Repository
public interface IIncidenciaRepository extends JpaRepository<Incidencia, Long> {

}
