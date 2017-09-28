package com.aps.testing.stepDefinitions;

import org.hibernate.Session;

import com.aps.testing.entity.CURR_IDENTITY;
import com.aps.testing.util.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {
	Session session =HibernateUtil.getSessionFactory().openSession();
	session.beginTransaction();
	
	CURR_IDENTITY curIdentity=new CURR_IDENTITY();
	curIdentity.setIdentityId(1);
	curIdentity.setFirstName("Tom");
	curIdentity.setLastName("Jerry");
	curIdentity.setNpi("9838762843");
	curIdentity.setGender("male");
	
	session.save(curIdentity);
	session.getTransaction().commit();
	session.close();
	
	
	curIdentity=null;
	session=HibernateUtil.getSessionFactory().openSession();
	session.beginTransaction();
	
	curIdentity=(CURR_IDENTITY)session.get(CURR_IDENTITY.class,1 );
	System.out.println("The user name is: "+ curIdentity.getFirstName());

	
	

	}

}
