package com.nucasim.nucasim.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.nucasim.nucasim.enumeration.FormaPago;

@Entity
@Table(name="nucasim09")

public class RegistroPagos implements Serializable{

	private static final long serialVersionUID = 1210773951219777657L;

	@Id
	@Column(name="numero", length=7, nullable=false, 
	columnDefinition="mediumint(7) unsigned zerofill")
	private int numero;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fecha", nullable=false)
	private Date fecha;
	
	@Enumerated(EnumType.STRING)
	@Column(name="forma_pago", nullable=false)
	private FormaPago formaPago;
	
	@Column(name="nro_transaccion", length=10, nullable=true)
	private String nroTransaccion;
	
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="codigo")
	private Bancos banco;
	
	@Column(name="concepto", length=60, nullable=false)
	private String concepto;
	
	@Column(name="valor", length=7, nullable=false)
	private int valor;
	
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="codigo")
	private Cursos curso;
	
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="identificacion")
	private Estudiantes identificacion;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="actualizado", nullable=false)
	private Date actualizado;

	public RegistroPagos(int numero, Date fecha, FormaPago formaPago, String nroTransaccion, Bancos banco,
			String concepto, int valor, Cursos curso, Estudiantes identificacion, Date actualizado) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.formaPago = formaPago;
		this.nroTransaccion = nroTransaccion;
		this.banco = banco;
		this.concepto = concepto;
		this.valor = valor;
		this.curso = curso;
		this.identificacion = identificacion;
		this.actualizado = actualizado;
	}

	public RegistroPagos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public FormaPago getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(FormaPago formaPago) {
		this.formaPago = formaPago;
	}

	public String getNroTransaccion() {
		return nroTransaccion;
	}

	public void setNroTransaccion(String nroTransaccion) {
		this.nroTransaccion = nroTransaccion;
	}

	public Bancos getBanco() {
		return banco;
	}

	public void setBanco(Bancos banco) {
		this.banco = banco;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Cursos getCurso() {
		return curso;
	}

	public void setCurso(Cursos curso) {
		this.curso = curso;
	}

	public Estudiantes getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Estudiantes identificacion) {
		this.identificacion = identificacion;
	}

	public Date getActualizado() {
		return actualizado;
	}

	public void setActualizado(Date actualizado) {
		this.actualizado = actualizado;
	}

}
