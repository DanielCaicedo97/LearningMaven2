package com.husogroup.service.impl;

import org.apache.log4j.Logger;

import com.husogroup.dao.impl.UsuarioDaoImpl;
import com.husogroup.model.Usuario;

public class UsuarioServiceImpl {

	private static final Logger LOG = Logger.getLogger(UsuarioServiceImpl.class);

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

			return new UsuarioDaoImpl().create(usuario);

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
			
			
			return new UsuarioDaoImpl().update(usuario);
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

			return new UsuarioDaoImpl().get(id);
		} catch (Exception e) {

			LOG.error(e.getMessage(), e);
			return null;
		}

	}

}
