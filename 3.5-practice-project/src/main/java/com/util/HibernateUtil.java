package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class HibernateUtil {
	
	static SessionFactory sessionFactory;
	
	public static SessionFactory buildSessionFactory() {
		if (sessionFactory == null) {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");
			config.addAnnotatedClass(Student.class);
			
			sessionFactory = config.buildSessionFactory();
		}
		return sessionFactory;
	}

}
