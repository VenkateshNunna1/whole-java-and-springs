package com.hibernate.login;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class LoginValidation {

	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("venky");
		EntityManager em =emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Scanner in = new Scanner(System.in);
		System.out.println("enter email:");
		String email = in.next();
		System.out.println("enter password :");
		String password = in.next();
		Query query =em.createQuery("select u from User u where u.email =?1 and u.password=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);
		List<User>  user   = query.getResultList();
		if(user.size()>0) {
			System.out.println("welcome");
		}
		else {
			System.out.println("invalid credentials");
		}
		
		   
		
		

	}

}
