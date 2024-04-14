package com.springs.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.entityclass.Student;

@Repository  // it is used to instantiate student object
public class StudentDao {
	   @Autowired     // here we are tring to create object of emf but emf is an  interfae.the ioc container create the object for implementation classes
      EntityManagerFactory emf;//but in implementaion class is not annotated with @component annotation . the ioc container will go to the configuraion class
	                           //and the create the object of configuration class 
	   public void saveStudent(Student st) {
		   EntityManager em = emf.createEntityManager();
		   EntityTransaction et = em.getTransaction();
		   
		   et.begin();
		   em.persist(st);
		   et.commit();
 	   }
}   
