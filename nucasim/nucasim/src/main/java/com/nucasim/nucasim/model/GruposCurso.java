package com.nucasim.nucasim.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.nucasim.nucasim.enumeration.Estado2;

@Entity
@Table(name="nucasim10")

public class GruposCurso implements Serializable{

	private static final long serialVersionUID = 1754455558788898265L;

	@Id
	@Column(name="grupo", length=7, nullable=false,
	columnDefinition="mediumint(7) unsigned zerofill")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int grupo;
    
    @Column(name="descripcion", length=40, nullable=false)
	private String descripcion;
	
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="codigo")
	private Cursos curso;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_inicial", nullable=false)
	private Date fechaInicial;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_final", nullable=false)
	private Date fechaFinal;
	
	@Column(name="valor_curso", length=7, nullable=false)
	private int valorCurso;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="estado", nullable=false)
	private Estado2 estado;
	
	@Lob
	@Column(name="observaciones", length=100000, nullable=true)
	private byte[] observaciones;
	
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="identificacion")
	private Entrenadores entrenador;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="actualizado", nullable=false)
	private Date actualizado;

	public GruposCurso(int grupo, String descripcion, Cursos curso, Date fechaInicial, Date fechaFinal, int valorCurso,
			Estado2 estado, byte[] observaciones, Entrenadores entrenador, Date actualizado) {
		super();
		this.grupo = grupo;
		this.descripcion = descripcion;
		this.curso = curso;
		this.fechaInicial = fechaInicial;
		this.fechaFinal = fechaFinal;
		this.valorCurso = valorCurso;
		this.estado = estado;
		this.observaciones = observaciones;
		this.entrenador = entrenador;
		this.actualizado = actualizado;
	}

	public GruposCurso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getGrupo() {
		return grupo;
	}

	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cursos getCurso() {
		return curso;
	}

	public void setCurso(Cursos curso) {
		this.curso = curso;
	}

	public Date getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public int getValorCurso() {
		return valorCurso;
	}

	public void setValorCurso(int valorCurso) {
		this.valorCurso = valorCurso;
	}

	public Estado2 getEstado() {
		return estado;
	}

	public void setEstado(Estado2 estado) {
		this.estado = estado;
	}

	public byte[] getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(byte[] observaciones) {
		this.observaciones = observaciones;
	}

	public Entrenadores getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenadores entrenador) {
		this.entrenador = entrenador;
	}

	public Date getActualizado() {
		return actualizado;
	}

	public void setActualizado(Date actualizado) {
		this.actualizado = actualizado;
	}

}