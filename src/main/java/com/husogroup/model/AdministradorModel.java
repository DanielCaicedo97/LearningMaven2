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
			session.save(administrador);
			session.getTransaction().commit();
			session.close();

			return true;

		} catch (Exception e) {
			session.getTransaction().rollback();
			LOG.error(e.getMessage(), e);
			return false;
		}
	};

}
