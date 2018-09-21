package com.hib.demo.pojo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
		
		
		User user = new User();
		user.setName("Rajib");
		user.setAddress("USA");
		user.setDob(new Date());
		user.setUsername("root");
		user.setPassword("root");
		
		session.save(user);
		
		
		session.getTransaction().commit();
		
		
		
		session.close();
		
		
		
		

	}

}
