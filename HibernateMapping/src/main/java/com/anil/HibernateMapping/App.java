package com.anil.HibernateMapping;

import java.sql.DriverManager;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.anil.crud.Delete;
import com.anil.crud.Save;
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
        
        //Save sobj = new Save();
        Delete dobj = new Delete();
        dobj.delete(factory);
        //sobj.save(factory);
        
        factory.close();
    }
}
