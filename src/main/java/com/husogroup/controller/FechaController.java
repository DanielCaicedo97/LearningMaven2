package com.husogroup.controller;

import java.util.Date;

import org.apache.log4j.Logger;

import com.husogroup.exception.AppException;
import com.husogroup.service.impl.FechaServiceImpl;

public class FechaController {

	private static final Logger LOG = Logger.getLogger(FechaController.class);

	public boolean create(int id, Date fecha, Date hora, String estado) {

		try {
			boolean crearFecha = new FechaServiceImpl().create(id, fecha, hora, estado);
			return crearFecha;

		} catch (AppException e) {

			StringBuilder message = new StringBuilder();
			message.append("Severidad: ");
			message.append(e.getDetails().getSeverityEnum());
			message.append("\nTipo de Error: ");
			message.append(e.getMessage());
			message.append("\nDebido a: ");
			message.append(e.getDetails().getKey());

			LOG.error(message);

			System.out.println(message);

		} catch (Exception e) {
			LOG.error(e.getMessage());
		}

		return false;
	}

}
