package com.husogroup.model;

import java.util.Date;

public class Fecha {

	private int id;
	private Date fecha;
	private Date hora;
	private String estado;

	public Fecha(int id, Date fecha, Date hora, String estado) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
