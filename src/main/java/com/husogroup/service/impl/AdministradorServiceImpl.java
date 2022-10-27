package com.husogroup.service.impl;

import java.util.Date;

import org.apache.log4j.Logger;

import com.husogroup.dao.impl.AdministradorDaoImpl;
import com.husogroup.model.Administrador;

public class AdministradorServiceImpl {

	private static final Logger LOG = Logger.getLogger(AdministradorServiceImpl.class);

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

			return new AdministradorDaoImpl().create(administrador);
		} catch (Exception e) {

			LOG.error(e.getMessage(), e);
			return false;
		}

	}

	public boolean delete(int id) {
		try {

			return new AdministradorDaoImpl().delete(id);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			return false;

		}
	}

	public Administrador get(int id) {

		try {
			return new AdministradorDaoImpl().get(id);

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

			return new AdministradorDaoImpl().update(administrador);
		} catch (Exception e) {

			LOG.error(e.getMessage(), e);
			return false;
		}
	}
}
