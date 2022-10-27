package com.husogroup.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cita")
public class Cita {

	@Id
	@Column
	private int id;
	@Column
	private int administradorId;
	@Column
	private int usuarioId;
	@Column
	private int fechaId;
	@Column
	private String asunto;
	@Column
	private String terminos;

	public Cita() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAdministradorId() {
		return administradorId;
	}

	public void setAdministradorId(int administradorId) {
		this.administradorId = administradorId;
	}

	public int getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	public int getFechaId() {
		return fechaId;
	}

	public void setFechaId(int fechaId) {
		this.fechaId = fechaId;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getTerminos() {
		return terminos;
	}

	public void setTerminos(String terminos) {
		this.terminos = terminos;
	}

}
