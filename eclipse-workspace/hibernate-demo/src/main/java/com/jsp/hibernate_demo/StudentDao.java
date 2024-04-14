package com.jsp.hibernate_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDao {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("venkatesh");
       EntityManager em = emf.createEntityManager();//what is dao design pattern?
       EntityTransaction et = em.getTransaction();//the code which is displayed to the user that file which is not connected with database
       
       public void savedata(Student student) {
    	  et.begin();
  		 em.persist(student);
  		 et.commit();
       }
       public Student finddata(int id) {
    	   Student s = em.find(Student.class, id);
    	   return s;
       }
       public void deletedata(int id,Student s) {
    	  // Student s = em.find(Student.class, id);
    	   
    	   et.begin();
   		   em.remove(s);
   		   et.commit();
       }
}
