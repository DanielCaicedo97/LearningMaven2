package com.husogroup.model;

import java.util.Date;

import com.husogroup.controller.FechaController;

// Main class
public class App {

	// Main driver method
	public static void main(String[] args) {

		System.out.println("Iniciando Programa ...");
		
		// Crear FECHA //
		/*
		Date fecha = new Date();
		Date hora = new Date();
		Fecha fecha1 = new Fecha(0, fecha, hora, "1");

		boolean crearFecha = new FechaController().Create(fecha1);
		System.out.println(crearFecha ? "Fecha creada" : "Fecha no creada");
		*/
		
		//////////////////// ////////////////////////////////////////////////////////
		
		// Actualizar Fecha 
		/*
		Date fecha = new Date();
		Date hora = new Date();
		String estado = "0"; 
		
		boolean actualizarFecha = new FechaController().Update(2, fecha, hora, estado);
		System.out.println(actualizarFecha ? "Fecha actualizada" : "Fecha no actualizada");
		
		*/
		
		/*
		// Borrar Fecha
		boolean BorrarFecha = new FechaController().Delete(3);
		System.out.println( BorrarFecha? "Fecha Borrada " : "Fecha no Borrada");
		*/
		
		String ConsultarFecha = new FechaController().Get(3);
		
		System.out.println(ConsultarFecha);
		
	}
}