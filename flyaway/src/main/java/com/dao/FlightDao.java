package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Flight;
import com.util.HibernateUtil;

public class FlightDao {
	
	static public void saveFlight(Flight obj) {
		SessionFactory sf = HibernateUtil.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(obj);
		tx.commit();
		
		session.close();
		
	}
	
	static public List<Flight> getFlight() {
		SessionFactory sf = HibernateUtil.buildSessionFactory();
		Session session = sf.openSession();
		List<Flight> flights = session.createQuery("from Flight").list();
		
		session.close();
		
		return flights;
		
	}
	

}
