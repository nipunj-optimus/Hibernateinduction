package com.nipun.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.nipun.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

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
			int studentId = 1;

			//get a new session and start session

			session=factory.getCurrentSession();

			session.beginTransaction();

			//retreive data with the help of id

			System.out.println("Getting student  with the id of " +studentId);
			
			Student myStudent = session.get(Student.class, studentId);

			
			System.out.println("Updating Student");
			
			myStudent.setFirstName("nakul");
			
		
			
			System.out.println(myStudent);
			//commit
			session.getTransaction().commit();

			System.out.println("Done");
			
			
			//-----------------------------------------------------------
			//create session
			session = factory.getCurrentSession();
			session.beginTransaction();

			session.createQuery("update Student set email='jindal@gmail.com'").executeUpdate(); 
			//commit session
			session.getTransaction().commit();
		}
		finally 
		{
			factory.close();
		}		
	}

}
