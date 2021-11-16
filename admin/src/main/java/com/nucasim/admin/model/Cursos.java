package com.nucasim.admin.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.nucasim.admin.enumeration.Estado;


@Entity
@Table(name="nucasim02")

public class Cursos implements Serializable{

	private static final long serialVersionUID = -7296603812499849027L;

	@Id
	@Column(name="codigo", length=4, nullable=false)
	private String codigo;
		
	@Column(name="descripcion", length=60, nullable=false)
	private String descripcion;
	
	@Column(name="valor", length=7, nullable=false)
	private int valor;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="deshabilitar", nullable=false)
	private Estado deshabilitar;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="actualizado", nullable=false)
	private Date actualizado;

	public Cursos(String codigo, String descripcion, int valor, Estado deshabilitar, Date actualizado) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.valor = valor;
		this.deshabilitar = deshabilitar;
		this.actualizado = actualizado;
	}

	public Cursos() {
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

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
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
