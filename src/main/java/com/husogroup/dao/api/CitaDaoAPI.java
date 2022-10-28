package com.husogroup.dao.api;

import com.husogroup.model.Cita;

public interface CitaDaoAPI {

	boolean create(Cita cita);

	boolean update(Cita cita);

	boolean delete(int id);

	Cita get(int id);

}
