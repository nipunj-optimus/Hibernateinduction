package com.nipun.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.nipun.hibernate.demo.entity.Student;

public class QueryStudentDemo {

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
		
			
			//Start Transaction
			session.beginTransaction();
			
			//query students
			List<Student> students = session.createQuery("from Student").list(); 
			
			
			//display the student
			for(Student tempstudent :students)
				System.out.println(tempstudent);
			
			//query students having last name as 'jindal'
			List<Student> mystudent = session.createQuery("from Student s where s.lastName ='Jindal'").list();
			
			for(Student tempstudent : mystudent)
				System.out.println(tempstudent); 
			
			//query student having first name as nikhil and last name as jindal
			List<Student> myStudent = session.createQuery("from Student s where"+ " s.firstName='Nikhil' OR s.lastName='Jindal'").list();
			
			for(Student tempstudent : myStudent)
				System.out.println("First Name as Nikhil last name as jindal "+tempstudent);
			
			//commit the transaction
			session.getTransaction().commit();
			System.out.println("Done");
					
			
		}finally {
			factory.close();
		}		
	}

}
