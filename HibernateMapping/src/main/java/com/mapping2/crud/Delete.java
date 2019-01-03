package com.mapping2.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.mapping2.model.Instructor;

public class Delete {
	public void delete(SessionFactory sf)
	{
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		
		Instructor instructor = session.get(Instructor.class,101);
		
		
		session.delete(instructor);
		session.getTransaction().commit();
		
	}

}
