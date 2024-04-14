package com.jsp.hibernate_demo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchStudent {

	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("venkatesh");
		EntityManager em =emf.createEntityManager();
		Scanner in = new Scanner(System.in);
		System.out.println("enter which id details you wnt to fetch:");
		int id = in.nextInt();
		Student student=em.find(Student.class, id);
		    if(student!=null) {
		    	System.out.println(student.getName());
		    	System.out.println(student.getAge());
		    	System.out.println(student.getPhonenumber());
		    }
		    else {
		    	System.out.println("enter valid id");
		    }

	}

}
