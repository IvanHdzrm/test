package com.incidencia.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "operador")

public class Operador implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "idOperador")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idOperador;
	@Column(name = "nombre")
	String nombre;
	@Column(name = "apellidoP")
	String apellidoP;
	@Column(name = "apellidoM")
	String apellidoM;

	public Operador(Long idOperador, String nombre, String apellidoP, String apellidoM) {
		super();
		this.idOperador = idOperador;
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
	}
	
	public Operador () {
		
	}

	public Long getIdOperador() {
		return idOperador;
	}

	public void setIdOperador(Long idOperador) {
		this.idOperador = idOperador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public String getApellidoM() {
		return apellidoM;
	}

	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}

}