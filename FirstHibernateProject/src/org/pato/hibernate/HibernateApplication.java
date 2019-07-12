package org.pato.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.pato.dto.UserDetails;

public class HibernateApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails userDetails=new UserDetails(2,"vijay"); 
	SessionFactory sessionFactory=	new Configuration().configure().buildSessionFactory();
	  Session session=  sessionFactory.openSession();
	  session.beginTransaction();
	  session.save(userDetails);
      session.getTransaction().commit();
	}

}
