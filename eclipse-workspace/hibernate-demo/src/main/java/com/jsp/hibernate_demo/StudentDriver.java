package com.jsp.hibernate_demo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("venkatesh");
		EntityManager em =emf.createEntityManager();
		EntityTransaction et = em.getTransaction();// whenever we are performing any changes in database like update,insert,delete data 
		//we require entity transaction.
		
		//Student s1 = new Student();//if you created the object outside the loop, you will get exception beacause 
		// we are tring to save the same object reference inside the persistence context.inorder, to solve the problem
		//we should create the object inside the loop
		//we can't save/store the multiple objects with same reference  inside persistence context.
		//we can store multiple objects with different references inside persistence context.u
	for(int i=0;i<2;i++) {	
		Student s1 = new Student();
		System.out.println("Enter id:");
		int id = in.nextInt();
		System.out.println("Enter name:");
		String name = in.next();
		System.out.println("Enter age:");
		int age = in.nextInt();
		System.out.println("Enter phonenumber:");
		long phonenumber=in.nextLong();
	
		
		s1.setId(id);
		s1.setName(name);
		s1.setAge(age);
		s1.setPhonenumber(phonenumber);
		et.begin();//allocate block of memory from persistence context.this process is called begining the transaction.
		 em.persist(s1);//save the data inside the database
		 et.commit();//save the changes in the db
	}
	
		 System.out.println("data saved successfully");
		
		
	}


}
