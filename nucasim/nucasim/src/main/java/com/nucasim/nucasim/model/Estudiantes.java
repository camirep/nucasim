package com.nucasim.nucasim.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.nucasim.nucasim.enumeration.TipoIdentif;

@Entity
@Table(name="nucasim07")

public class Estudiantes implements Serializable{

	private static final long serialVersionUID = -6070426161633479309L;

	@Id
	@Column(name="identificacion", length=10, nullable=false)
	private int identificacion;
		
	@Enumerated(EnumType.STRING)
	@Column(name="tipo_identificacion", nullable=false)
	private TipoIdentif tipoIdentificacion;
	
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="codigo")
	private Ciudades lugarExpedicion;
	
	@Column(name="nombre", length=40, nullable=false)
	private String nombre;
	
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="codigo")
	private Ciudades ciudadResidencia;
	
	@Column(name="celular", length=35, nullable=false)
	private String celular;
	
	@Column(name="profesion", length=2, nullable=false)
	private int profesion;
	
	@Column(name="institucion", length=40, nullable=false)
	private String institucion;
	
	@Column(name="email", length=200, nullable=true)
	private String email;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="actualizado", nullable=false)
	private Date actualizado;

	public Estudiantes(int identificacion, TipoIdentif tipoIdentificacion, Ciudades lugarExpedicion, String nombre,
			Ciudades ciudadResidencia, String celular, int profesion, String institucion, String email,
			Date actualizado) {
		super();
		this.identificacion = identificacion;
		this.tipoIdentificacion = tipoIdentificacion;
		this.lugarExpedicion = lugarExpedicion;
		this.nombre = nombre;
		this.ciudadResidencia = ciudadResidencia;
		this.celular = celular;
		this.profesion = profesion;
		this.institucion = institucion;
		this.email = email;
		this.actualizado = actualizado;
	}

	public Estudiantes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public TipoIdentif getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(TipoIdentif tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public Ciudades getLugarExpedicion() {
		return lugarExpedicion;
	}

	public void setLugarExpedicion(Ciudades lugarExpedicion) {
		this.lugarExpedicion = lugarExpedicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ciudades getCiudadResidencia() {
		return ciudadResidencia;
	}

	public void setCiudadResidencia(Ciudades ciudadResidencia) {
		this.ciudadResidencia = ciudadResidencia;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public int getProfesion() {
		return profesion;
	}

	public void setProfesion(int profesion) {
		this.profesion = profesion;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getActualizado() {
		return actualizado;
	}

	public void setActualizado(Date actualizado) {
		this.actualizado = actualizado;
	}

}