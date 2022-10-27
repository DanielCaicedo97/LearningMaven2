package com.husogroup.service;

import java.util.Date;

import org.apache.log4j.Logger;

import com.husogroup.dao.AdministradorDao;
import com.husogroup.model.Administrador;

public class AdministradorService {

	private static final Logger LOG = Logger.getLogger(AdministradorService.class);

	public boolean create(int id, String nombre, String apellido, String telefono, String documento,
			String correoElectronico, int contrasena, String correoRecuperacion, Date ultimaSesion) {

		try {

			Administrador administrador = new Administrador();
			administrador.setId(id);
			administrador.setNombre(nombre);
			administrador.setApellido(apellido);
			administrador.setTelefono(telefono);
			administrador.setDocumento(documento);
			administrador.setCorreoElectronico(correoElectronico);
			administrador.setContrasena(contrasena);
			administrador.setCorreoRecuperacion(correoRecuperacion);
			administrador.setUltimaSesion(ultimaSesion);

			return new AdministradorDao().create(administrador);
		} catch (Exception e) {

			LOG.error(e.getMessage(), e);
			return false;
		}

	}

	public boolean delete(int id) {
		try {

			return new AdministradorDao().delete(id);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			return false;

		}
	}

	public Administrador get(int id) {

		try {
			return new AdministradorDao().get(id);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			return null;
		}
	}

	public boolean Update(int id, String nombre, String apellido, String telefono, String documento,
			String correoElectronico, int contrasena, String correoRecuperacion, Date ultimaSesion) {
		try {

			Administrador administrador = new Administrador();
			administrador.setId(id);
			administrador.setNombre(nombre);
			administrador.setApellido(apellido);
			administrador.setTelefono(telefono);
			administrador.setDocumento(documento);
			administrador.setCorreoElectronico(correoElectronico);
			administrador.setContrasena(contrasena);
			administrador.setCorreoRecuperacion(correoRecuperacion);
			administrador.setUltimaSesion(ultimaSesion);

			return new AdministradorDao().update(administrador);
		} catch (Exception e) {

			LOG.error(e.getMessage(), e);
			return false;
		}
	}
}
