package com.jsp.hibernate_demo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchDataBeforeUpdate {
     public static void main(String[] args) {
    	 Scanner in  =new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("venkatesh");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		System.out.println("enter which id details you wnt to fetch:");
		int id = in.nextInt();
		 Student student =em.find(Student.class,id );
		 System.out.println("enter new name");
		 String name =in.next();
		 student.setName(name);
		 et.begin();
		 em.merge(student);
		 et.commit();
		
	}
}
