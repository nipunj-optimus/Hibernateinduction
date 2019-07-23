package com.nipun.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nipun.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		//Create session factory
	SessionFactory factory = new Configuration()
			.configure("hibernate.cf g.xml")
			.addAnnotatedClass(Student.class)
			.buildSessionFactory();
	
	// create session
	Session session= factory.getCurrentSession();
try {
	//create a students object
	
	System.out.println("Creating a object....");
	
	Student student1 = new Student("Nikhil","Yadav","Nikhil.yadav@optimusinfo.com");
	
	Student student2 = new Student("Himanshu","Jindal","Himanshu.jindal@optimusinfo.com");
	
	Student student3= new Student ("Rajesh","Gupta","Rajesh.gupta@optimusinfo.com");
	
	//Begin Transaction
	
	session.beginTransaction();
	
	//save data
	
	System.out.println("saving data");
	
	session.save(student1);
	session.save(student2);
	session.save(student3);
	
	//commit transaction
	
	session.getTransaction().commit();
	
	System.out.println("Done......!");
  
}
finally {
	factory.close();
}
	
	}

}
