package com.husogroup.service;

import org.apache.log4j.Logger;

import com.husogroup.dao.UsuarioDao;
import com.husogroup.model.Usuario;

public class UsuarioService {

	private static final Logger LOG = Logger.getLogger(UsuarioService.class);

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

			return new UsuarioDao().create(usuario);

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
			
			
			return new UsuarioDao().update(usuario);
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

			return new UsuarioDao().get(id);
		} catch (Exception e) {

			LOG.error(e.getMessage(), e);
			return null;
		}

	}

}
