package com.husogroup.service.impl;

import java.util.Date;

import org.apache.log4j.Logger;

import com.husogroup.dao.impl.FechaDaoImpl;
import com.husogroup.exception.AppException;
import com.husogroup.exception.ExceptionDetails;
import com.husogroup.exception.SeverityEnum;
import com.husogroup.model.Fecha;
import com.husogroup.service.api.FechaServiceAPI;

public class FechaServiceImpl implements FechaServiceAPI {

	private static final Logger LOG = Logger.getLogger(FechaServiceImpl.class);

	public boolean create(int id, Date dia, Date hora, String estado) throws AppException {

		if (dia.equals(hora)) {

			ExceptionDetails details = new ExceptionDetails("Valor de Fecha incorrecto", SeverityEnum.WARN);
			throw new AppException("La fecha no debe ser igual a la fecha actual", details);
		}

		try {

			// Validación simulada

//			int horaDia = dia.getHours();  
//			int horaHora = hora.getHours();
//			

			Fecha fecha = new Fecha();
			fecha.setId(id);
			fecha.setFecha(dia);
			fecha.setHora(hora);
			fecha.setEstado(estado);

			return new FechaDaoImpl().create(fecha);

		} catch (Exception e) {
			throw e;
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
