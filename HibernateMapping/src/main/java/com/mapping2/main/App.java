package com.mapping2.main;




import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mapping2.crud.Delete;
import com.mapping2.crud.Save;
import com.mapping2.model.Courses;
import com.mapping2.model.Instructor;


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
					        		.addAnnotatedClass(Instructor.class)
					        		.addAnnotatedClass(Courses.class)
					        		.buildSessionFactory();
        
        //Save sobj = new Save();
        Delete dobj = new Delete();
        dobj.delete(factory);
       // sobj.save(factory);
        
        factory.close();
    }
}
