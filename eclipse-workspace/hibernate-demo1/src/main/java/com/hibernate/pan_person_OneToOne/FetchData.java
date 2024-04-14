package com.hibernate.pan_person_OneToOne;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hibernate.onetoone.Country;

public class FetchData {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("venky");
		EntityManager em = emf.createEntityManager();
		Scanner in = new Scanner(System.in);
		System.out.println("enter which pancard id details you want to fetch");//fetching pancard details from person
		int id = in.nextInt();
		Person p =em.find(Person.class,id);// here we
		/*System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getMobileNumber());*/
		System.out.println("-----------PAN DETAILS----------");
		Pan pan = p.getPan();
		System.out.println(pan.getId());
		System.out.println(pan.getPanNo());
		System.out.println(pan.getAddress());
		
		
		System.out.println("enter which person details you want to fetch");//fetching person details from pan
		int id1 = in.nextInt();
		Pan pancard = em.find(Pan.class, id);
	    Person person = pancard.getPerson();
	    System.out.println("-----------Person details----------");
	    System.out.println(person.getId());
	    System.out.println(person.getName());
	    System.out.println(person.getAge());
	    System.out.println(person.getMobileNumber());
		
		
		
		

	}

}
