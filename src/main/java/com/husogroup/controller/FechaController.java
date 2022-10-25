package com.husogroup.controller;

import java.util.Date;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.husogroup.classes.Fecha;

public class FechaController {

	private static final Logger LOG = Logger.getLogger(FechaController.class);

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

	public void DoubleUpdate(int id1, int id2, String Estado) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Fecha.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();

			Fecha fecha = session.get(Fecha.class, id1);
			Fecha fecha2 = session.get(Fecha.class, id2);

			fecha.setEstado(Estado);
			fecha2.setEstado(Estado);
			session.getTransaction().commit();
			session.close();

		} catch (Exception e) {
			session.getTransaction().rollback();
			session.close();
			LOG.error(e.getMessage(), e);

		}

	}

}
