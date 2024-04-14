package com.hibernate.pan_person_OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("venky");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
           Person p = new Person();
          p.setId(1);
          p.setName("venkatesh");
          p.setAge(23);
          p.setMobileNumber(630987578);
          
          Pan pan = new Pan();
          pan.setId(1);
          pan.setPanNo("A9876N");
          pan.setAddress("Vetapalem");
          
          p.setPan(pan);
          pan.setPerson(p);
          
          et.begin();
          em.persist(p);
          em.persist(pan);
          et.commit();
	}

}
