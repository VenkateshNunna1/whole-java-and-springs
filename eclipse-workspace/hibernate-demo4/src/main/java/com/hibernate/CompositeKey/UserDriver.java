package com.hibernate.CompositeKey;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("venkatesh");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		User user1 = new User();
		user1.setId(1);
		user1.setName("venkatesh");
		user1.setEmail("venkatesh@gmail.com");
		user1.setPassword("venky@2001");
		
		User user2 = new User();
		user2.setId(2);
		user2.setName("venky");
		user2.setEmail("venky@gmail.com");
		user2.setPassword("venky@2001");
		
		
		et.begin();
		em.persist(user1);
		em.persist(user2);
		et.commit();
	}

}
