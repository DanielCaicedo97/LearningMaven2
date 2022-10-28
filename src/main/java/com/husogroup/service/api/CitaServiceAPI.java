package com.husogroup.service.api;

import com.husogroup.model.Cita;

public interface CitaServiceAPI {

	boolean create(int id, int usuarioId, int administradorId, int fechaId, String asunto, String terminos);

	boolean update(int id, int usuarioId, int administradorId, int fechaId, String asunto, String terminos);

	boolean delete(int id);

	Cita get(int id);

}
