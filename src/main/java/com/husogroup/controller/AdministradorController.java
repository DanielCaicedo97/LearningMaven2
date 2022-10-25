package com.husogroup.controller;

import java.util.Date;

import org.apache.log4j.Logger;

import com.husogroup.classes.Administrador;
import com.husogroup.model.*;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

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

}
