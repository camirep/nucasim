package com.nucasim.admin.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.nucasim.admin.enumeration.Estado;

@Entity
@Table(name="nucasimciaf01")

public class Ciudades implements Serializable{

	private static final long serialVersionUID = 1109060904552346751L;

	@Id
	@Column(name="codigo", length=5, nullable=false)
	private String codigo;
		
	@Column(name="nombre", length=30, nullable=false)
	private String nombre;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="deshabilitar", nullable=false)
	private Estado deshabilitar;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="actualizado", nullable=false)
	private Date actualizado;
	
	public Ciudades(String codigo, String nombre, Estado deshabilitar, Date actualizado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.deshabilitar = deshabilitar;
		this.actualizado = actualizado;
	}

	public Ciudades() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estado getDeshabilitar() {
		return deshabilitar;
	}

	public void setDeshabilitar(Estado deshabilitar) {
		this.deshabilitar = deshabilitar;
	}

	public Date getActualizado() {
		return actualizado;
	}

	public void setActualizado(Date actualizado) {
		this.actualizado = actualizado;
	}
		
}
