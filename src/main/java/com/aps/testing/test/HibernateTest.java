package com.aps.testing.test;

import org.hibernate.Session;

import com.aps.testing.entities.CURR_IDENTITY;
import com.aps.testing.util.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {
	Session session =HibernateUtil.getSessionFactory().openSession();
	session.beginTransaction();
	
	CURR_IDENTITY curIdentity=new CURR_IDENTITY();
	curIdentity.setFirstName("Tom");
	curIdentity.setLastName("Jerry");
	curIdentity.setNpi("9838762843");
	curIdentity.setGender("male");
	
	System.out.println("Line 20");
	System.out.println(session.toString());
	session.save(curIdentity);
	session.getTransaction().commit();
	HibernateUtil.shutdown();

	}

}
