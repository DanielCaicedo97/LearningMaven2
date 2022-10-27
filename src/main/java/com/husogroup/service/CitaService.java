package com.husogroup.service;

import org.apache.log4j.Logger;

import com.husogroup.dao.CitaDao;
import com.husogroup.model.Cita;

public class CitaService {
	private static final Logger LOG = Logger.getLogger(Cita.class);

	public boolean create(int id, int usuarioId, int administradorId, int fechaId, String asunto, String terminos) {

		try {

			Cita cita = new Cita();
			cita.setId(id);
			cita.setAsunto(asunto);
			cita.setTerminos(terminos);
			cita.setUsuarioId(usuarioId);
			cita.setAdministradorId(administradorId);
			cita.setFechaId(fechaId);

			return new CitaDao().create(cita);
		} catch (Exception e) {

			LOG.error(e.getMessage(), e);
			return false;
		}

	}

	public boolean delete(int id) {
		try {

			return new CitaDao().delete(id);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			return false;

		}
	}

	public Cita get(int id) {

		try {
			return new CitaDao().get(id);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			return null;
		}

	}

	public boolean update(int id, int usuarioId, int administradorId, int fechaId, String asunto, String terminos) {

		try {

			Cita cita = new Cita();
			cita.setId(id);
			cita.setAsunto(asunto);
			cita.setTerminos(terminos);
			cita.setUsuarioId(usuarioId);
			cita.setAdministradorId(administradorId);
			cita.setFechaId(fechaId);

			return new CitaDao().update(cita);
		} catch (Exception e) {

			LOG.error(e.getMessage(), e);
			return false;
		}

	}
}
