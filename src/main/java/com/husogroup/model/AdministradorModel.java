package com.husogroup.model;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.husogroup.classes.Administrador;

public class AdministradorModel {

	private static final Logger LOG = Logger.getLogger(AdministradorModel.class);

	public boolean create(Administrador administrador) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Administrador.class);

		// Create Session Factory
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// Initialize Session Object
		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();
			session.persist(administrador);
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
		configuration.addAnnotatedClass(Administrador.class);

		// Create Session Factory
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// Initialize Session Object
		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();
			Administrador admin = session.get(Administrador.class, id);

			session.delete(admin);
			session.getTransaction().commit();
			session.close();
			return true;
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			return false;
		}
	}

	public Administrador get(int id) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Administrador.class);

		// Create Session Factory
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// Initialize Session Object
		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();
			Administrador admin = session.get(Administrador.class, id);

			session.getTransaction().commit();
			session.close();
			return admin;

		} catch (Exception e) {
			session.getTransaction().rollback();
			LOG.error(e.getMessage(), e);
			return null;
		}
	}
	
	public boolean update(Administrador admin) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Administrador.class);

		// Create Session Factory
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// Initialize Session Object
		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();
			Administrador adminUpdate = session.get(Administrador.class, admin.getId());
			
			adminUpdate.setNombre(admin.getNombre());
			adminUpdate.setApellido(admin.getApellido());
			adminUpdate.setDocumento(admin.getDocumento());
			adminUpdate.setTelefono(admin.getTelefono());
			adminUpdate.setCorreoElectronico(admin.getCorreoElectronico());
			adminUpdate.setCorreoRecuperacion(admin.getCorreoRecuperacion());
			adminUpdate.setContrasena(admin.getContrasena());
			adminUpdate.setUltimaSesion(admin.getUltimaSesion());
			
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
