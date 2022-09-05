package com.incidencia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incidencia.entities.Incidencia;
import com.incidencia.repositories.IIncidenciaRepository;

import interfaces.IGeneralCrud;

@Service

public class IncidenciaService implements IGeneralCrud<Incidencia> {
	
	@Autowired
	IIncidenciaRepository incidenciaRepository;

	@Override
	public Incidencia obtenerPorId(Long id) {
		Optional<Incidencia> OIncidencia = this.incidenciaRepository.findById(id);
		
		if	(OIncidencia.isPresent()) {
			return OIncidencia.get();
		}
		return null;
	}

	@Override
	public Incidencia crear(Incidencia entidad) {
		
		return this.incidenciaRepository.save(entidad);
	}

	@Override
	public List<Incidencia> obtenerTodos() {
		
		return this.incidenciaRepository.findAll();
	}

}
