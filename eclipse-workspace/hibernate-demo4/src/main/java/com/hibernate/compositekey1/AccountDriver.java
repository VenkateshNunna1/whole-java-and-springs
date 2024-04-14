package com.hibernate.compositekey1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AccountDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("venkatesh");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Account account1 = new Account();
		account1.setId(1);
		account1.setName("venkatesh");
		account1.setAccountpk(new AccountPk(345678,8097));
		
		Account account2 = new Account();
		account2.setId(2);
		account2.setName("ganesh");
		account2.setAccountpk(new AccountPk(3456878,80907));
		 et.begin();
		 em.persist(account1);
		 em.persist(account2);
		 et.commit();
		
		  	}

}
