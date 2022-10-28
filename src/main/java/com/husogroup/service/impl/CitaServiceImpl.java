package com.husogroup.service.impl;

import org.apache.log4j.Logger;

import com.husogroup.dao.impl.CitaDaoImpl;
import com.husogroup.model.Cita;
import com.husogroup.service.api.CitaServiceAPI;

public class CitaServiceImpl implements CitaServiceAPI {
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

			return new CitaDaoImpl().create(cita);
		} catch (Exception e) {

			LOG.error(e.getMessage(), e);
			return false;
		}

	}

	public boolean delete(int id) {
		try {

			return new CitaDaoImpl().delete(id);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			return false;

		}
	}

	public Cita get(int id) {

		try {
			return new CitaDaoImpl().get(id);

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

			return new CitaDaoImpl().update(cita);
		} catch (Exception e) {

			LOG.error(e.getMessage(), e);
			return false;
		}

	}
}
