package com.hibernate.SeocondLevelCache;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserDriver {

	public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("venkatesh");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			User user = new User();
			user.setId(1);
			user.setName("venkatesh");
			user.setMobileNumber(68970009);
			
			et.begin();
			em.persist(user);
			et.commit();

	} 

}
