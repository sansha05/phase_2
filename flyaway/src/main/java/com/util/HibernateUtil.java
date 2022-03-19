package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Admin;
import com.entity.Flight;

public class HibernateUtil {
	
	static SessionFactory sessionFactory;
	
	static public SessionFactory buildSessionFactory() {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Flight.class);
		config.addAnnotatedClass(Admin.class);
		
		sessionFactory = config.buildSessionFactory();
		
		return sessionFactory;
	}
	
}
