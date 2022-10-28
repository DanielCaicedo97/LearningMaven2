package com.husogroup.service.api;

import java.util.Date;

import com.husogroup.model.Administrador;

public interface AdministradorServiceAPI {

	boolean create(int id, String nombre, String apellido, String telefono, String documento, String correoElectronico,
			int contrasena, String correoRecuperacion, Date ultimaSesion);

	boolean update(int id, String nombre, String apellido, String telefono, String documento, String correoElectronico,
			int contrasena, String correoRecuperacion, Date ultimaSesion);

	boolean delete(int id);

	Administrador get(int id);

}
