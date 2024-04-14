package com.hibernate.login;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserDao {
   EntityManagerFactory emf = Persistence.createEntityManagerFactory("venky");
   EntityManager em = emf.createEntityManager();
   EntityTransaction  et = em.getTransaction();
   
   public void savedata(User user) {
	   et.begin();
	   em.persist(user);
	   et.commit();
   }
  
}
