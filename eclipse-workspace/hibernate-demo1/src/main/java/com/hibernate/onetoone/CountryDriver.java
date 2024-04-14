package com.hibernate.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CountryDriver {
      public static void main(String[] args) {
    	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("venky");
    	  EntityManager em = emf.createEntityManager();
    	  EntityTransaction et = em.getTransaction();
	    	Country country1 = new Country();
			country1.setId(1);
			country1.setName("india");
			country1.setCapital("Delhi");
			
			Country country2 = new Country();
			country2.setId(2);
			country2.setName("england");
			country2.setCapital("london");
	        
		    Primeminster pm1 = new Primeminster();
		    pm1.setId(1);
		    pm1.setName("Modi");
		    pm1.setAge(70);
		    
		    Primeminster pm2 = new  Primeminster();
		    pm2.setId(2);
		    pm2.setName("Rishi sunak");
		    pm2.setAge(48);
		    
		    country1.setPrimeminster(pm1);
		    country2.setPrimeminster(pm2);
		    
		    et.begin();
		    em.persist(country1);
		    em.persist(country2);
		    em.persist(pm1);
		    em.persist(pm2);
		    et.commit();
		
	}
}
