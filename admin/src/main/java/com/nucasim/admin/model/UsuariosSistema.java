package com.nucasim.admin.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="nucasim98")

public class UsuariosSistema implements Serializable{
	
	private static final long serialVersionUID = -8425256519937386954L;

	@Id
	@Column(name="id_usuario", length=7, nullable=false, 
	columnDefinition="mediumint(7) unsigned zerofill")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUsuario;
    
    @Column(name="tipo", nullable=false, 
    columnDefinition="UNSIGNED TINYINT(1)")
	private int tipo;
    
    @Column(name="NOMBRE", length=30, nullable=false)
	private String nombre;

	@Column(name="email", length=250, nullable=false)
	private String email;
	
	@Lob
	@Column(name="password", length=100000, nullable=false)
	private byte[] password;

	@Column(name="key", length=4, nullable=false, unique=true)
	private String key;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="actualizado", nullable=false)
	private Date actualizado;

	public UsuariosSistema(int idUsuario, int tipo, String nombre, String email, byte[] password, String key,
			Date actualizado) {
		super();
		this.idUsuario = idUsuario;
		this.tipo = tipo;
		this.nombre = nombre;
		this.email = email;
		this.password = password;
		this.key = key;
		this.actualizado = actualizado;
	}

	public UsuariosSistema() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte[] getPassword() {
		return password;
	}

	public void setPassword(byte[] password) {
		this.password = password;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Date getActualizado() {
		return actualizado;
	}

	public void setActualizado(Date actualizado) {
		this.actualizado = actualizado;
	}

}