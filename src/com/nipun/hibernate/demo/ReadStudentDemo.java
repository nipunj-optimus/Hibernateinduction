package com.nipun.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.nipun.hibernate.demo.entity.Student;

public class ReadStudentDemo {

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
			Student tempStudent = new Student("aakanksha","devgan","aakanksha.devgan@optimusinfo.com");

			//Start Transaction
			session.beginTransaction();

			//save the student object
			System.out.println("Saving the object in database");
			System.out.println(tempStudent);
			session.save(tempStudent);

			//commit the transaction

			session.getTransaction().commit();

			System.out.println("Done");

			//find students id

			System.out.println("the id of new student is" + tempStudent.getId());

			//get a new session and start session

			session=factory.getCurrentSession();

			session.beginTransaction();

			//retreive data with the help of id

			System.out.println("Getting student  with the id of " +tempStudent.getId());
			Student myStudent = session.get(Student.class, tempStudent.getId());

			System.out.println("Get complete data"+myStudent);

			//commit
			session.getTransaction().commit();

			System.out.println("Done");

		}finally {
			factory.close();
		}		
	}

}
