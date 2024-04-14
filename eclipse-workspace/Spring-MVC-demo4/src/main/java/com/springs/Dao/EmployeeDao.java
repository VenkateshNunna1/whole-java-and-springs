package com.springs.Dao;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springs.entityClasses.Employee;
@Repository
public class EmployeeDao {
	
   @Autowired
   EntityManagerFactory emf;
  
   
   public void insert(Employee e) {
	   EntityManager em = emf.createEntityManager();
	   EntityTransaction et = em.getTransaction();
	   et.begin();
	   em.persist(e);
	   et.commit();
	   System.out.println("Inserted");
   }
}
