package com.husogroup.classes;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "administrador")
public class Administrador {

	@Id
	@Column
	private int id;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private String telefono;
	@Column
	private String correoElectronico;
	@Column
	private String documento;
	@Column
	private int contrasena;
	@Column
	private String correoRecuperacion;
	@Column
	private Date ultimaSesion;

	public Administrador() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getCorreoRecuperacion() {
		return correoRecuperacion;
	}

	public void setCorreoRecuperacion(String correoRecuperacion) {
		this.correoRecuperacion = correoRecuperacion;
	}

	public Date getUltimaSesion() {
		return ultimaSesion;
	}

	public void setUltimaSesion(Date ultimaSesion) {
		this.ultimaSesion = ultimaSesion;
	}

	public int getContrasena() {
		return contrasena;
	}

	public void setContrasena(int contrasena) {
		this.contrasena = contrasena;
	}

	
}
