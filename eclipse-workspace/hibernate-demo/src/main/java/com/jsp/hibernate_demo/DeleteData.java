package com.jsp.hibernate_demo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteData {
       public static void main(String[] args) {
    	   Scanner in = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("venkatesh");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		System.out.println("enter id whose data you want to delete from database:");
		int id = in.nextInt();
		Student s =em.find(Student.class,id);
		et.begin();
		em.remove(s);
		et.commit();
		
	} 
}
