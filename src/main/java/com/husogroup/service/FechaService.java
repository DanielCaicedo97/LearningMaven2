package com.husogroup.service;

import java.util.Date;

import org.apache.log4j.Logger;

import com.husogroup.dao.FechaDao;
import com.husogroup.model.Fecha;

public class FechaService {

	private static final Logger LOG = Logger.getLogger(FechaService.class);

	public boolean create(int id, Date dia, Date hora, String estado) {

		try {

			Fecha fecha = new Fecha();
			fecha.setId(id);
			fecha.setFecha(dia);
			fecha.setHora(hora);
			fecha.setEstado(estado);

			return new FechaDao().create(fecha);
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			return false;
		}

	}

	public boolean delete(int id) {
		try {

			return new FechaDao().delete(id);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			return false;

		}
	}

	public Fecha get(int id) {

		try {
			return new FechaDao().get(id);

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

			return new FechaDao().update(fecha);
		} catch (Exception e) {

			LOG.error(e.getMessage(), e);
			return false;
		}

	}

}
