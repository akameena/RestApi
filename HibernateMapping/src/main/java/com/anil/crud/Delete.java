package com.anil.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.anil.model.Employee;
import com.anil.model.Technology;

public class Delete {
	public void delete(SessionFactory sf)
	{
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		//Employee emp = session.get(Employee.class, 105);
		Technology tech = session.get(Technology.class, 1);
		//System.out.println("tech_________________"+tech);
		session.delete(tech);
		session.getTransaction().commit();
		
	}

}
