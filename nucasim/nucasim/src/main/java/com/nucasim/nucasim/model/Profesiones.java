package com.nucasim.nucasim.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.nucasim.nucasim.enumeration.Estado;

@Entity
@Table(name="nucasim03")

public class Profesiones implements Serializable{

	private static final long serialVersionUID = 5921831786449924320L;

	@Id
	@Column(name="codigo", length=2, nullable=false)
	private int codigo;
		
	@Column(name="descripcion", length=30, nullable=false)
	private String descripcion;
		
	@Enumerated(EnumType.ORDINAL)
	@Column(name="deshabilitar", nullable=false)
	private Estado deshabilitar;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="actualizado", nullable=false)
	private Date actualizado;

	public Profesiones(int codigo, String descripcion, Estado deshabilitar, Date actualizado) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.deshabilitar = deshabilitar;
		this.actualizado = actualizado;
	}

	public Profesiones() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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