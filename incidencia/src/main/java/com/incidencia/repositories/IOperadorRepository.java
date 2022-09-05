package com.incidencia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incidencia.entities.Operador;


@Repository
public interface IOperadorRepository extends JpaRepository<Operador, Long> {

}
