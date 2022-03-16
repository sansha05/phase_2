package com.util;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.entity.Player;
import com.entity.Team;

public class HibernateUtil {
	
	static SessionFactory sessionFactory;
	
	static public SessionFactory buildSessionFactory() {
		
		if (sessionFactory == null) {
			Configuration config = new Configuration();
			
			config.configure("hibernate.cfg.xml");
			config.addAnnotatedClass(Player.class);
			config.addAnnotatedClass(Team.class);
			
			
			sessionFactory = config.buildSessionFactory();
			
		}
		
		
		return sessionFactory;
	}

}
