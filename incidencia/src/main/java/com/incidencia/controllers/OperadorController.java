package com.incidencia.controllers;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incidencia.entities.Operador;
import com.incidencia.repositories.IOperadorRepository;

import interfaces.IGeneralCrud;

@RestController
@RequestMapping(value = "/operador")
public class OperadorController implements IGeneralCrud<Operador>{

	@Override
	public Operador obtenerPorId(Long id) {
		// TODO Auto-generated method stub
		return ; //ResponseEntity.ok();
	}

	@Override
	public Operador crear(Operador entidad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Operador> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}


}
