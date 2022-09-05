package com.incidencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incidencia.entities.Operador;
import com.incidencia.repositories.IOperadorRepository;

import interfaces.IGeneralCrud;

@Service
public class OperadorService implements IGeneralCrud<Operador> {
	
	@Autowired
	IOperadorRepository operadorRepository;

	@Override
	public Operador obtenerPorId(Long id) {
		
		if (this.operadorRepository.findById(id).isEmpty() ) {
			return null;
			
		}
		return this.operadorRepository.findById(id).get();
		
	}

	@Override
	public Operador crear(Operador entidad) {
		return this.operadorRepository.save(entidad);
	}

	@Override
	public List<Operador> obtenerTodos() {
		List <Operador> operadores = this.operadorRepository.findAll();
		return operadores;
	}

}
