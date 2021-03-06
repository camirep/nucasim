package com.nucasim.admin.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.nucasim.admin.enumeration.EstadoEstudianteGrupo;


@Entity
@Table(name="nucasimciaf11")

public class EstudiantesGrupo implements Serializable{

	private static final long serialVersionUID = -7830185023865311354L;

	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="grupo")
	private GruposCurso grupo;
	
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="identificacion")
	private Estudiantes identificacion;
	
	@Lob
	@Column(name="observaciones", length=100000, nullable=true)
	private byte[] observaciones;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="estado", nullable=false)
	private EstadoEstudianteGrupo estado;

	@Id
	@Column(name="id_estudiantegrupo", length=7, nullable=false, 
	columnDefinition="mediumint(7) unsigned zerofill")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEstudianteGrupo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="actualizado", nullable=false)
	private Date actualizado;

	public EstudiantesGrupo(GruposCurso grupo, Estudiantes identificacion, byte[] observaciones, EstadoEstudianteGrupo estado,
			int idEstudianteGrupo, Date actualizado) {
		super();
		this.grupo = grupo;
		this.identificacion = identificacion;
		this.observaciones = observaciones;
		this.estado = estado;
		this.idEstudianteGrupo = idEstudianteGrupo;
		this.actualizado = actualizado;
	}

	public EstudiantesGrupo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GruposCurso getGrupo() {
		return grupo;
	}

	public void setGrupo(GruposCurso grupo) {
		this.grupo = grupo;
	}

	public Estudiantes getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Estudiantes identificacion) {
		this.identificacion = identificacion;
	}

	public byte[] getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(byte[] observaciones) {
		this.observaciones = observaciones;
	}

	public EstadoEstudianteGrupo getEstado() {
		return estado;
	}

	public void setEstado(EstadoEstudianteGrupo estado) {
		this.estado = estado;
	}

	public int getIdEstudianteGrupo() {
		return idEstudianteGrupo;
	}

	public void setIdEstudianteGrupo(int idEstudianteGrupo) {
		this.idEstudianteGrupo = idEstudianteGrupo;
	}

	public Date getActualizado() {
		return actualizado;
	}

	public void setActualizado(Date actualizado) {
		this.actualizado = actualizado;
	}

}