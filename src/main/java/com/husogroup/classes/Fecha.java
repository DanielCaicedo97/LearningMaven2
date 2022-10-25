package com.husogroup.classes;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table (name = "fecha")
public class Fecha {

	@Id
	@Column
	private int id;
	@Column
	private Date fecha;
	@Column
	private Date hora;
	@Column
	private String estado;

	public Fecha() {
	
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

	@Override
	public String toString() {
		return "Fecha [id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", estado=" + estado + "]";
	}
	
	
	

}
