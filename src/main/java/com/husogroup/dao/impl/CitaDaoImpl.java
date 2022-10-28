package com.husogroup.dao.impl;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.husogroup.dao.api.CitaDaoAPI;
import com.husogroup.model.Cita;

public class CitaDaoImpl implements CitaDaoAPI{

	private static final Logger LOG = Logger.getLogger(CitaDaoImpl.class);

	public boolean create(Cita cita) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Cita.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();
			session.persist(cita);
			session.getTransaction().commit();
			session.close();

			return true;

		} catch (Exception e) {
			session.getTransaction().rollback();
			LOG.error(e.getMessage(), e);
			return false;
		}
	};

	public boolean delete(int id) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Cita.class);

		// Create Session Factory
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// Initialize Session Object
		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();
			Cita cita = session.get(Cita.class, id);

			session.remove(cita);
			session.getTransaction().commit();
			session.close();
			return true;
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			return false;
		}
	}

	public Cita get(int id) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Cita.class);

		// Create Session Factory
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// Initialize Session Object
		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();
			Cita cita = session.get(Cita.class, id);

			session.getTransaction().commit();
			session.close();
			return cita;

		} catch (Exception e) {
			session.getTransaction().rollback();
			LOG.error(e.getMessage(), e);
			return null;
		}
	}

	public boolean update(Cita cita) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Cita.class);

		// Create Session Factory
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// Initialize Session Object
		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();
			Cita citaUpdate = session.get(Cita.class, cita.getId());

			citaUpdate.setAsunto(cita.getAsunto());
			citaUpdate.setTerminos(cita.getTerminos());
			citaUpdate.setUsuarioId(cita.getUsuarioId());
			citaUpdate.setAdministradorId(cita.getAdministradorId());
			citaUpdate.setFechaId(cita.getFechaId());

			session.getTransaction().commit();
			session.close();
			return true;

		} catch (Exception e) {
			session.getTransaction().rollback();
			LOG.error(e.getMessage(), e);
			return false;
		}
	}

}
