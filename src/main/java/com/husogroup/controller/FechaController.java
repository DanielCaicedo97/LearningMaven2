package com.husogroup.controller;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.husogroup.model.Fecha;

public class FechaController {

	public boolean Create(Fecha fecha) {

		// Create Configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Fecha.class);

		// Create Session Factory
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// Initialize Session Object
		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();
			session.save(fecha);
			session.getTransaction().commit();
			session.close();

			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

	public boolean Update(int id, Date dia, Date hora, String estado) {

		// Create Configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Fecha.class);

		// Create Session Factory
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// Initialize Session Object
		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();
			Fecha fecha = session.get(Fecha.class, id);

			fecha.setFecha(dia);
			fecha.setHora(hora);
			fecha.setEstado(estado);

			session.update(fecha);
			session.getTransaction().commit();
			session.close();

			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

	public boolean Delete(int id) {

		// Create Configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Fecha.class);

		// Create Session Factory
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// Initialize Session Object
		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();
			Fecha fecha = session.get(Fecha.class, id);
			session.delete(fecha);
			session.getTransaction().commit();
			session.close();

			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

	public String Get(int id) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Fecha.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();

			Fecha fecha = session.get(Fecha.class, id);
			session.getTransaction().commit();
			session.close();

			return fecha.toString();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "Usuario no encontrado";

	}

}
