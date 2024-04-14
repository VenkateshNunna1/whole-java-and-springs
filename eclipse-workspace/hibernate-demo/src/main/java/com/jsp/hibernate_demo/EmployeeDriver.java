package com.jsp.hibernate_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDriver {
     public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("venkatesh");
		System.out.println("table created");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("venkatesh");
		emp1.setRoll("java developer");
		 et.begin();//allocate block of memory from persistence context.this process is called begining the transaction.
		 em.persist(emp1);//save the data inside the database
		 et.commit();//save the changes in the db
		 System.out.println("data saved successfully");
		
	}
}
