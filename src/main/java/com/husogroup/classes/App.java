package com.husogroup.classes;

import java.util.Date;

import com.husogroup.controller.AdministradorController;

// Main class
public class App {

	// Main driver method
	public static void main(String[] args) {

		// Creando un Administrador

		String nombre = "Daniel", Apellido = "Caicedo", telefono = "3251275", documento = "1234189060",
				correoElectronico = "daniel@correo.com", correoRecuperacion = "alejandro@correo.com";

		int contrasena = 1234;
		Date ultimaSesion = new Date();

		boolean admin = new AdministradorController().create(0, nombre, Apellido, telefono, documento,
				correoElectronico, contrasena, correoRecuperacion, ultimaSesion);
		System.out.println(admin ? "Creado" : "no creado");

		/*
		 * 
		 * System.out.println("Iniciando Programa ...");
		 * 
		 * new FechaController().DoubleUpdate(5, 60, "7");
		 */
		/*
		 * // Practicando con Log4j LogJava.debug("LOG DEBUG");
		 * LogJava.info("LOG INFO"); LogJava.warn("LOG WARN");
		 * LogJava.error("LOG ERROR"); LogJava.fatal("LOG FATAL");
		 */
		/*
		 * // Crear FECHA //
		 * 
		 * Date fecha = new Date(); Date hora = new Date(); Fecha fecha1 = new Fecha();
		 * 
		 * fecha1.setFecha(fecha); fecha1.setEstado("1"); fecha1.setHora(hora);
		 * 
		 * boolean crearFecha = new FechaController().Create(fecha1);
		 * System.out.println(crearFecha ? "Fecha creada" : "Fecha no creada");
		 */

		//////////////////// ////////////////////////////////////////////////////////

		// Actualizar Fecha
		/*
		 * Date fecha = new Date(); Date hora = new Date(); String estado = "0";
		 * 
		 * boolean actualizarFecha = new FechaController().Update(2, fecha, hora,
		 * estado); System.out.println(actualizarFecha ? "Fecha actualizada" :
		 * "Fecha no actualizada");
		 * 
		 */

		/*
		 * // Borrar Fecha boolean BorrarFecha = new FechaController().Delete(3);
		 * System.out.println( BorrarFecha? "Fecha Borrada " : "Fecha no Borrada");
		 */

		// Consultar Fecha
		/*
		 * String ConsultarFecha = new FechaController().Get(3);
		 * System.out.println(ConsultarFecha);
		 */

		/*
		 * // Ejercicio 1 agregar 10 registros en un usando for
		 * 
		 * 
		 * Fecha fecha1 = new Fecha();
		 * 
		 * List<Fecha> listaFecha = new ArrayList<>();
		 * 
		 * for (int i = 0; i < 10; i++) {
		 * 
		 * Date fecha = new Date(); Date hora = new Date();
		 * 
		 * fecha1.setFecha(fecha); fecha1.setEstado((i % 2 == 0 ? "1" : "0"));
		 * fecha1.setHora(hora); listaFecha.add(fecha1); pause(1000); }
		 * 
		 * System.out.println(listaFecha.size());
		 * 
		 * for (Fecha fechaFor : listaFecha) { System.out.println(fechaFor); new
		 * FechaController().Create(fechaFor); } ///// Fin ejercicio
		 */
		/*
		 * for(int i = 8;i<38;i++) { boolean BorrarFecha = new
		 * FechaController().Delete(i); }
		 * 
		 */

		// Practicando con Log4j

	}

	public static void pause(int ms) {

		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			System.err.format("IOException: %s%n", e);
		}
	}

}