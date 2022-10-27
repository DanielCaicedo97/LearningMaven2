package com.husogroup.service.impl;

import java.util.Date;

import org.apache.log4j.Logger;

import com.husogroup.dao.impl.FechaDaoImpl;
import com.husogroup.model.Fecha;

public class FechaServiceImpl {

	private static final Logger LOG = Logger.getLogger(FechaServiceImpl.class);

	public boolean create(int id, Date dia, Date hora, String estado) {

		try {

			Fecha fecha = new Fecha();
			fecha.setId(id);
			fecha.setFecha(dia);
			fecha.setHora(hora);
			fecha.setEstado(estado);

			return new FechaDaoImpl().create(fecha);
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			return false;
		}

	}

	public boolean delete(int id) {
		try {

			return new FechaDaoImpl().delete(id);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			return false;

		}
	}

	public Fecha get(int id) {

		try {
			return new FechaDaoImpl().get(id);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			return null;
		}

	}

	public boolean Update(int id, Date dia, Date hora, String estado) {

		try {

			Fecha fecha = new Fecha();
			fecha.setId(id);
			fecha.setFecha(dia);
			fecha.setHora(hora);
			fecha.setEstado(estado);

			return new FechaDaoImpl().update(fecha);
		} catch (Exception e) {

			LOG.error(e.getMessage(), e);
			return false;
		}

	}

}
