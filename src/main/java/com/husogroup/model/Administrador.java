package com.husogroup.model;

import java.util.Date;

public class Administrador {

	private int id;
	private String nombre;
	private String apellido;
	private String telefono;
	private String correoElectronico;
	private String documento;
	private String contraseña;
	private String correoRecuperacion;
	private Date ultimaSesion;

	public Administrador(int id, String nombre, String apellido, String telefono, String correoElectronico,
			String documento, String contraseña, String correoRecuperacion, Date ultimaSesion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
		this.documento = documento;
		this.contraseña = contraseña;
		this.correoRecuperacion = correoRecuperacion;
		this.ultimaSesion = ultimaSesion;
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

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
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
	
	

}
