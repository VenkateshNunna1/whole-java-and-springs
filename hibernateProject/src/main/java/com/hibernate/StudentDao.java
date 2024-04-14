package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDao {
	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("venkatesh");
	  EntityManager em = emf.createEntityManager();
      EntityTransaction et = em.getTransaction();
	   public void saveData(Student s) {
		   et.begin();
	   	  em.persist(s);
	     	et.commit();
	   }
   public Student fetch(int id) {
	  Student student=  em.find(Student.class, id);
	return student;
	  
	  
   }
}
