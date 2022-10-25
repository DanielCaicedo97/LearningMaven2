package com.husogroup.classes;

public class Cita {

	private int id;
	private int administradorId;
	private int usuarioId;
	private int fechaId;
	private String asuntos;
	private String terminos;

	public Cita(int id, int administradorId, int usuarioId, int fechaId, String asuntos, String terminos) {
		super();
		this.id = id;
		this.administradorId = administradorId;
		this.usuarioId = usuarioId;
		this.fechaId = fechaId;
		this.asuntos = asuntos;
		this.terminos = terminos;
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

	public String getAsuntos() {
		return asuntos;
	}

	public void setAsuntos(String asuntos) {
		this.asuntos = asuntos;
	}

	public String getTerminos() {
		return terminos;
	}

	public void setTerminos(String terminos) {
		this.terminos = terminos;
	}

}
