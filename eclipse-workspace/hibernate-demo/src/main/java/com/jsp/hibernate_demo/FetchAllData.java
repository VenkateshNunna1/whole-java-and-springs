package com.jsp.hibernate_demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class FetchAllData {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("venkatesh");
		EntityManager em = emf.createEntityManager();
		Query query= em.createQuery("select v from Student v");
		List<Student>  students = query.getResultList();
		for(Student s: students) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getPhonenumber());
			System.out.println(s.getAge());
			System.out.println("-------------------------------------------------------------");
		}
		                   

	}

}
