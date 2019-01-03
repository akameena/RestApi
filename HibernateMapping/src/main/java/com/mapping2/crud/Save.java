package com.mapping2.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mapping2.model.Courses;
import com.mapping2.model.Instructor;

public class Save {
	public void save(SessionFactory sf)
	{
		Instructor instructor = new Instructor(101, "anil");
		Courses courses = new Courses(1, "java", instructor);
        Session session = sf.getCurrentSession();
        session.beginTransaction();
        //session.save(tech);
        session.save(courses);
        session.getTransaction().commit();
	}
}
