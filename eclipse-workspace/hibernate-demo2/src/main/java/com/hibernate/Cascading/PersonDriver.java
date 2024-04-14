package com.hibernate.Cascading;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("venkatesh");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person person = new Person();
		person.setName("venkatesh");
		person.setAge(23);
		
		Aadhar aadhar = new Aadhar();
		aadhar.setAadharNumber(678904321);
		aadhar.setAddress("1-8/a,vetapalem,523187");
		person.setAadhar(aadhar);
		
		et.begin();
		em.persist(person);
		et.commit();
	}

}
