package com.hibernate.ManyToOne;

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
		country1.setName("India");
		country1.setPopulation(14000000);
		
		
		States state1 = new States();
		state1.setId(1);
		state1.setSname("Andhra Pradesh");
		state1.setCm("Jagan Mohan Reddy");
		state1.setCountry(country1);
		
		States state2 = new States();
		state2.setId(2);
		state2.setSname("Karanataka");
		state2.setCm("Sidda Ramaiah");
		
		state2.setCountry(country1);
		
		
		et.begin();
		em.persist(country1);
		em.persist(state1);
		em.persist(state2);
		et.commit();
		

	}

}
