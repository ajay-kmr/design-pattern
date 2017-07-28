package com.ttn.designpatterns.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private HibernateUtil() {
		
	}
	
	private static SessionFactory buildSessionFactory() {
		
		try {
			return new Configuration().configure().buildSessionFactory();
		} catch(Throwable t) {
			System.err.println("Initial SessionFactory creation failed." + t);
			throw new ExceptionInInitializerError(t);
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void shutdown() {
		getSessionFactory().close();
	}
}
