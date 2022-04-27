package com.nucasim.admin.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="nucasimciaf08")

public class RepositorioDoc implements Serializable{

	private static final long serialVersionUID = 4014463587744000805L;

	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="identificacion")
	private Estudiantes identificacion;
	
	@Column(name="nombre_documento", length=40, nullable=false)
	private String nombreDocumento;
	
	@Column(name="link", length=200, nullable=false)
	private String link;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fecha", nullable=false)
	private Date fecha;
	
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="codigo")
	private Cursos curso;
	
	@Id
	@Column(name="id_repositorio", length=7, nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idRepositorio;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="actualizado", nullable=false)
	private Date actualizado;

	public RepositorioDoc(Estudiantes identificacion, String nombreDocumento, String link, Date fecha, Cursos curso,
			int idRepositorio, Date actualizado) {
		super();
		this.identificacion = identificacion;
		this.nombreDocumento = nombreDocumento;
		this.link = link;
		this.fecha = fecha;
		this.curso = curso;
		this.idRepositorio = idRepositorio;
		this.actualizado = actualizado;
	}

	public RepositorioDoc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estudiantes getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Estudiantes identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombreDocumento() {
		return nombreDocumento;
	}

	public void setNombreDocumento(String nombreDocumento) {
		this.nombreDocumento = nombreDocumento;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Cursos getCurso() {
		return curso;
	}

	public void setCurso(Cursos curso) {
		this.curso = curso;
	}

	public int getIdRepositorio() {
		return idRepositorio;
	}

	public void setIdRepositorio(int idRepositorio) {
		this.idRepositorio = idRepositorio;
	}

	public Date getActualizado() {
		return actualizado;
	}

	public void setActualizado(Date actualizado) {
		this.actualizado = actualizado;
	}

}