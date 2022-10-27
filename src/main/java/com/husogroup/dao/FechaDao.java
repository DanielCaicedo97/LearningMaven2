package com.husogroup.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.husogroup.model.Fecha;

public class FechaDao {

	private static final Logger LOG = Logger.getLogger(FechaDao.class);

	public boolean create(Fecha fecha) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Fecha.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();
			session.persist(fecha);
			session.getTransaction().commit();
			session.close();

			return true;
		} catch (Exception e) {
			session.getTransaction().rollback();
			LOG.error(e.getMessage(), e);
			return false;
		}

	}

	public boolean update(Fecha fecha) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Fecha.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();
			Fecha fechaUpdate = session.get(Fecha.class, fecha.getId());

			fechaUpdate.setFecha(fecha.getFecha());
			fechaUpdate.setHora(fecha.getHora());
			fechaUpdate.setEstado(fecha.getEstado());

			session.getTransaction().commit();
			session.close();

			return true;
		} catch (Exception e) {
			session.getTransaction().rollback();
			LOG.error(e.getMessage(), e);
			return false;
		}

	}

	public boolean delete(int id) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Fecha.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();
			Fecha fecha = session.get(Fecha.class, id);
			session.delete(fecha);
			session.getTransaction().commit();
			session.close();

			return true;
		} catch (Exception e) {
			session.getTransaction().rollback();

			LOG.error(e.getMessage(), e);
			return false;

		}
	}

	public Fecha get(int id) {
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

			return fecha;
		} catch (Exception e) {
			session.getTransaction().rollback();
			LOG.error(e.getMessage(), e);
			return null;
		}

	}

//	public void DoubleUpdate(int id1, int id2, String Estado) {
//		Configuration configuration = new Configuration();
//		configuration.configure("hibernate.cfg.xml");
//		configuration.addAnnotatedClass(Fecha.class);
//
//		SessionFactory sessionFactory = configuration.buildSessionFactory();
//
//		Session session = sessionFactory.openSession();
//
//		try {
//
//			session.beginTransaction();
//
//			Fecha fecha = session.get(Fecha.class, id1);
//			Fecha fecha2 = session.get(Fecha.class, id2);
//
//			fecha.setEstado(Estado);
//			fecha2.setEstado(Estado);
//			session.getTransaction().commit();
//			session.close();
//
//		} catch (Exception e) {
//			session.getTransaction().rollback();
//			session.close();
//			LOG.error(e.getMessage(), e);
//
//		}
//
//	}

}
