package com.anil.HibernateMapping;

import java.sql.DriverManager;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.anil.model.Employee;
import com.anil.model.Technology;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory factory = new Configuration()
					        		.configure()
					        		.addAnnotatedClass(Employee.class)
					        		.addAnnotatedClass(Technology.class)
					        		.buildSessionFactory();
        Technology tech = new Technology(3,"python");
        Employee emp = new Employee(101,"anil",tech);
        
        System.out.println("yes2");
        
        System.out.println("yes3");
        Session session = factory.getCurrentSession();
       
        session.beginTransaction();
        session.save(tech);
        session.save(emp);
        session.getTransaction().commit();
        factory.close();
    }
}
