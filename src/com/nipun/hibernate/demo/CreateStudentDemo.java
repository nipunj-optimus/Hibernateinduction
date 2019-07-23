package com.nipun.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.nipun.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {

		// Create a session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try 
		{
			// create a student object
			System.out.println("Creating Student object");
			Student tempStudent = new Student("Nipun","Jindal","nipun.jindal@optimusinfo.com");
			
			//Start Transaction
			session.beginTransaction();
			
			//save the student object
			System.out.println("Saving the object in database");
			session.save(tempStudent);
			
			//commit the transaction
			session.getTransaction().commit();
			System.out.println("Done");
					
			
		}finally {
			factory.close();
		}		
	}

}
