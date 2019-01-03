package com.anil.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.anil.model.Employee;
import com.anil.model.Technology;

public class Save {
	public void save(SessionFactory sf)
	{
		Technology tech = new Technology(10,"go");
        Employee emp = new Employee(110,"ska",tech);
        Session session = sf.getCurrentSession();
        session.beginTransaction();
        //session.save(tech);
        session.save(emp);
        session.getTransaction().commit();
	}
}
