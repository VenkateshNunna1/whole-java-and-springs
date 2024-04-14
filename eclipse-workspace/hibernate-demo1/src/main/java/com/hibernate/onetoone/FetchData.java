package com.hibernate.onetoone;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchData {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("venky");
		EntityManager em = emf.createEntityManager();
		Scanner in = new Scanner(System.in);
		System.out.println("enter which country id details you want to fetch");
		int id = in.nextInt();
		Country c =em.find(Country.class,id);
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getCapital());
	    System.out.println("----------prime minster details---------------");
	     Primeminster pm = c.getPrimeminster();
	     System.out.println(pm.getId());
	     System.out.println(pm.getName());
	     System.out.println(pm.getAge());
		

	}

}
