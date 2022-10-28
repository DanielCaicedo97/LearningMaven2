package com.husogroup.service.api;

import com.husogroup.model.Usuario;

public interface UsuarioServiceAPI {

	boolean create(int id, String nombre, String apellido, String telefono, String documento, String correoElectronico);

	boolean update(int id, String nombre, String apellido, String telefono, String documento, String correoElectronico);

	boolean delete(int id);

	Usuario get(int id);
}
