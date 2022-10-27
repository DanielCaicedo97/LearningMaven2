package com.husogroup.model;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.husogroup.classes.Usuario;

public class UsuarioModel {

	private static final Logger LOG = Logger.getLogger(UsuarioModel.class);

	public boolean create(Usuario usuario) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Usuario.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();
			session.persist(usuario);
			session.getTransaction().commit();
			session.close();

			return true;
		} catch (Exception e) {
			session.getTransaction().rollback();
			LOG.error(e.getMessage(), e);
			return false;
		}

	}

	public boolean update(Usuario usuario) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Usuario.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();
			Usuario usuarioUpdate = session.get(Usuario.class, usuario.getId());

			usuarioUpdate.setNombre(usuario.getNombre());
			usuarioUpdate.setApellido(usuario.getApellido());
			usuarioUpdate.setDocumento(usuario.getDocumento());
			usuarioUpdate.setTelefono(usuario.getTelefono());
			usuarioUpdate.setCorreoElectronico(usuario.getCorreoElectronico());

			session.getTransaction().commit();
			session.close();

			return true;
		} catch (Exception e) {
			session.getTransaction().rollback();
			LOG.error(e.getMessage(), e);
			return false;
		}

	}

	public boolean delete() {

		try {

			return true;
		} catch (Exception e) {

			LOG.error(e.getMessage(), e);
			return false;
		}

	}

	public Usuario get(int id) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Usuario.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {

			session.beginTransaction();
			Usuario usuario = session.get(Usuario.class, id);
			session.getTransaction().commit();
			session.close();

			return usuario;
		} catch (Exception e) {
			session.getTransaction().rollback();
			LOG.error(e.getMessage(), e);
			return null;
		}

	}

}
