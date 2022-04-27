package com.nucasim.admin.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.nucasim.admin.enumeration.Estado;

@Entity
@Table(name="nucasimciaf05")

public class Bancos implements Serializable{

	private static final long serialVersionUID = -2337251516782507951L;

	@Id
	@Column(name="codigo", length=2, nullable=false)
	private String codigo;
		
	@Column(name="descripcion", length=40, nullable=false)
	private String descripcion;
		
	@Enumerated(EnumType.ORDINAL)
	@Column(name="deshabilitar", nullable=false)
	private Estado deshabilitar;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="actualizado", nullable=false)
	private Date actualizado;
	
	public Bancos(String codigo, String descripcion, Estado deshabilitar, Date actualizado) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.deshabilitar = deshabilitar;
		this.actualizado = actualizado;
	}

	public Bancos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
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