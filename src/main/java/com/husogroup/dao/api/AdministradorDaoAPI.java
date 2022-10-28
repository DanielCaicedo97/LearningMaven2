package com.husogroup.dao.api;

import com.husogroup.model.Administrador;

public interface AdministradorDaoAPI {

	boolean create(Administrador administrador);

	boolean update(Administrador administrador);

	boolean delete(int id);

	Administrador get(int id);
}
