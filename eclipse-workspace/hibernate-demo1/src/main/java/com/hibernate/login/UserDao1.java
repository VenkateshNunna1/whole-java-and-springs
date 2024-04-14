package com.hibernate.login;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserDao1 {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("venky");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
      public List<User> validateDataDynamically(String email,String password){
    	  Query query=em.createQuery("select v from User v where v.email=?1 and v.password=?2");
    	     query.setParameter(1,email);
    	     query.setParameter(2, password);
    	     List<User> user= query.getResultList();
    	     return user;  
      }
}
