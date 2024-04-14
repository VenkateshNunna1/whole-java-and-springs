package com.jsp.hibernate_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentUpdate {

	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("venkatesh");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et =em.getTransaction();
		Student s = new Student();
		s.setId(9);
		s.setName("venkatesh");
		s.setAge(34);
		s.setPhonenumber(908907777);
		et.begin();
		em.merge(s);
		et.commit();
	} 

}
