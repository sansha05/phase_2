package com.util;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.entity.Car;
import com.entity.Owner;

public class HibernateUtil {
	
	static SessionFactory sessionFactory;
	
	static public SessionFactory buildSessionFactory() {
		
		if (sessionFactory == null) {
			Configuration config = new Configuration();
			
			config.configure("hibernate.cfg.xml");
			config.addAnnotatedClass(Car.class);
			config.addAnnotatedClass(Owner.class);
			
			sessionFactory = config.buildSessionFactory();
			
		}
		
		
		return sessionFactory;
	}

}
