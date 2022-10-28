package com.husogroup.service.api;

import java.util.Date;

import com.husogroup.model.Fecha;

public interface FechaServiceAPI {

	boolean create(int id, Date dia, Date hora, String estado);

	boolean Update(int id, Date dia, Date hora, String estado);

	boolean delete(int id);

	Fecha get(int id);
}
