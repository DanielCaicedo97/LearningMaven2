package com.husogroup.model;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// Main class
public class App {

	// Main driver method
	public static void main(String[] args) {

		System.out.println("Iniciando Programa ...");
		// Create Configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Fecha.class);

		// Create Session Factory
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// Initialize Session Object
		Session session = sessionFactory.openSession();

		Date fecha = new Date();
		Date hora = new Date();
		Fecha fecha1 = new Fecha(0, fecha, hora, "1");

		session.beginTransaction();

		// Here we have used
		// save() method of JPA
		session.save(fecha1);

		session.getTransaction().commit();
	}
}