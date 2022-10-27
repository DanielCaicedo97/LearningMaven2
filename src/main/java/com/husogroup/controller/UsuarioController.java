package com.husogroup.controller;

import org.apache.log4j.Logger;

import com.husogroup.classes.App;
import com.husogroup.classes.Usuario;
import com.husogroup.model.UsuarioModel;

public class UsuarioController {

	private static final Logger LOG = Logger.getLogger(UsuarioController.class);

	public boolean create(int id, String nombre, String apellido, String telefono, String documento,
			String correoElectronico) {

		try {

			Usuario usuario = new Usuario();

			usuario.setId(id);
			usuario.setNombre(nombre);
			usuario.setApellido(apellido);
			usuario.setDocumento(documento);
			usuario.setTelefono(telefono);
			usuario.setCorreoElectronico(correoElectronico);

			return new UsuarioModel().create(usuario);

		} catch (Exception e) {

			LOG.error(e.getMessage(), e);
			return false;
		}

	}

	public boolean update(int id, String nombre, String apellido, String telefono, String documento,
			String correoElectronico) {

		try {
			
			Usuario usuario = new Usuario();
			
			usuario.setId(id);
			usuario.setNombre(nombre);
			usuario.setApellido(apellido);
			usuario.setDocumento(documento);
			usuario.setTelefono(telefono);
			usuario.setCorreoElectronico(correoElectronico);
			
			
			return new UsuarioModel().update(usuario);
		} catch (Exception e) {

			LOG.error(e.getMessage(), e);
			return false;
		}

	}

	public boolean delete() {

		try {

			return true;
		} catch (Exception e) {

			LOG.error(e.getMessage(), e);
			return false;
		}

	}

	public Usuario get(int id) {

		try {

			return new UsuarioModel().get(id);
		} catch (Exception e) {

			LOG.error(e.getMessage(), e);
			return null;
		}

	}

}
