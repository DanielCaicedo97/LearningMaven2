package com.husogroup.controller;

import java.util.Date;

import org.apache.log4j.Logger;

import com.husogroup.classes.Administrador;
import com.husogroup.model.AdministradorModel;

public class AdministradorController {

	private static final Logger LOG = Logger.getLogger(AdministradorController.class);

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

			return new AdministradorModel().create(administrador);
		} catch (Exception e) {

			LOG.error(e.getMessage(), e);
			return false;
		}

	}

	public boolean delete(int id) {
		try {

			return new AdministradorModel().delete(id);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			return false;

		}
	}

	public Administrador get(int id) {

		try {
			return new AdministradorModel().get(id);

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

			return new AdministradorModel().update(administrador);
		} catch (Exception e) {

			LOG.error(e.getMessage(), e);
			return false;
		}

	}
	

}
