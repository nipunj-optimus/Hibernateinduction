package com.nipun.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.nipun.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

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

			Student myStudent = session.get(Student.class, studentId);
			System.out.println("Deleting Student");
			//session.delete(myStudent);			
		
			
			System.out.println(myStudent);
			//commit
			session.getTransaction().commit();

			System.out.println("Done");
			
			
			//-----------------------------------------------------------
			//create session
			session = factory.getCurrentSession();
			session.beginTransaction();

			session.createQuery("Delete Student where id=2").executeUpdate(); 
			//commit session
			session.getTransaction().commit();
		}
		finally 
		{
			factory.close();
		}		
	}

}
