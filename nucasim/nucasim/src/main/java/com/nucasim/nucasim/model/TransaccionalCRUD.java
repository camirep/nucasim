package com.nucasim.nucasim.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="nucasim99")

public class TransaccionalCRUD implements Serializable{
	
	private static final long serialVersionUID = 3415643181248545791L;

	@Column(name="transaccion", length=1, nullable=false)
	private String transaccion;
	
	@Column(name="TABLA", length=10, nullable=false)
	private String TABLA;
	
	@Column(name="pk", length=30, nullable=false)
	private String pk;
	
	@Column(name="pkvalue", length=30, nullable=false)
	private String pkvalue;
	
	@Column(name="campo", length=30, nullable=false)
	private String campo;
	
	@Column(name="valororiginal", length=120, nullable=false)
	private String valorOriginal;
	
	@Column(name="valornuevo", length=120, nullable=false)
	private String valorNuevo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha", nullable=false)
	private Date fecha;
	
	@Column(name="usuario", length=20, nullable=false)
	private String usuario;
	
	@Id
	@Column(name="id_log", length=8, nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idLog;

	public TransaccionalCRUD(String transaccion, String tABLA, String pk, String pkvalue, String campo,
			String valorOriginal, String valorNuevo, Date fecha, String usuario, int idLog) {
		super();
		this.transaccion = transaccion;
		TABLA = tABLA;
		this.pk = pk;
		this.pkvalue = pkvalue;
		this.campo = campo;
		this.valorOriginal = valorOriginal;
		this.valorNuevo = valorNuevo;
		this.fecha = fecha;
		this.usuario = usuario;
		this.idLog = idLog;
	}

	public TransaccionalCRUD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTransaccion() {
		return transaccion;
	}

	public void setTransaccion(String transaccion) {
		this.transaccion = transaccion;
	}

	public String getTABLA() {
		return TABLA;
	}

	public void setTABLA(String tABLA) {
		TABLA = tABLA;
	}

	public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public String getPkvalue() {
		return pkvalue;
	}

	public void setPkvalue(String pkvalue) {
		this.pkvalue = pkvalue;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getValorOriginal() {
		return valorOriginal;
	}

	public void setValorOriginal(String valorOriginal) {
		this.valorOriginal = valorOriginal;
	}

	public String getValorNuevo() {
		return valorNuevo;
	}

	public void setValorNuevo(String valorNuevo) {
		this.valorNuevo = valorNuevo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getIdLog() {
		return idLog;
	}

	public void setIdLog(int idLog) {
		this.idLog = idLog;
	}
	
}