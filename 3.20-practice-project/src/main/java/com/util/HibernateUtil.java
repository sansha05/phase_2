package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Product;

public class HibernateUtil {
	
	static SessionFactory sessionFactory;
	
	static public SessionFactory buildSessionFactory() {
		
		if (sessionFactory == null) {
			Configuration config = new Configuration();
			
			config.configure("hibernate.cfg.xml");
			config.addAnnotatedClass(Product.class);
			
			sessionFactory = config.buildSessionFactory();
			
		}
		
		
		return sessionFactory;
	}

}
