package com.hibernate.SeocondLevelCache;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserFetchSeocondLevelCache {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("venkatesh");
		EntityManager em = emf.createEntityManager();//seocond level cache will used be used whenever we have multiple entity manager objects are 
		EntityManager em1 = emf.createEntityManager();
		
		em.find(User.class, 1);
		em1.find(User.class, 1);
		
	
		

	}

}
