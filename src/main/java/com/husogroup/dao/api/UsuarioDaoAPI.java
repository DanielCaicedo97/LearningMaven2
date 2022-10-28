package com.husogroup.dao.api;

import com.husogroup.model.Usuario;

public interface UsuarioDaoAPI {

	boolean create(Usuario usuario);

	boolean update(Usuario usuario);

	boolean delete(int id);

	Usuario get(int id);
}
