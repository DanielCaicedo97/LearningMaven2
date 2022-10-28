package com.husogroup.dao.api;

import com.husogroup.model.Fecha;

public interface FechaDaoAPI {

	boolean create(Fecha fecha);

	boolean update(Fecha fecha);

	boolean delete(int id);

	Fecha get(int id);

}
