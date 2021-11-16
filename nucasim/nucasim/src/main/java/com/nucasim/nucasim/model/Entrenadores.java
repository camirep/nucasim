package com.nucasim.nucasim.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.nucasim.nucasim.enumeration.Estado;

@Entity
@Table(name="nucasim04")

public class Entrenadores implements Serializable{

	private static final long serialVersionUID = 4850259982275032029L;

	@Id
	@Column(name="identificacion", length=10, nullable=false)
	private int identificacion;
		
	@Column(name="nombre", length=40, nullable=false)
	private String nombre;
	
	@Column(name="celular", length=35, nullable=false)
	private String celular;
	
	@Column(name="email", length=200, nullable=true)
	private String email;
		
	@Enumerated(EnumType.ORDINAL)
	@Column(name="deshabilitar", nullable=false)
	private Estado deshabilitar;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="actualizado", nullable=false)
	private Date actualizado;

	public Entrenadores(int identificacion, String nombre, String celular, String email, Estado deshabilitar,
			Date actualizado) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.celular = celular;
		this.email = email;
		this.deshabilitar = deshabilitar;
		this.actualizado = actualizado;
	}

	public Entrenadores() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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