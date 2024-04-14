package com.hibernate.alloperations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AccountDao {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("venky");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public void savedata(Account account) {
		et.begin();
		em.persist(account);
		et.commit();
	}
	public Account fetchdata(int id) {
		Account account =em.find(Account.class, id);
		return account;
	}
	public void deletedata(int id) {
		Account account =em.find(Account.class, id);
		et.begin();
		em.remove(account);
		et.commit();
	}
	public void updatedate(int id,Account account) {	
		et.begin();
		 em.merge(account);
		 et.commit();
	}
	public Account validateByAccountNoAndPassword(long accountnumber,long pincode) {
	Query query =	em.createQuery("select v from Account v where v.accountnumber=?1 and v.pincode =?2");
	query.setParameter(1, accountnumber);
	query.setParameter(2,pincode);
	List<Account> account=query.getResultList();
	if(account.size()>0)	{  
    	return account.get(0);
    }
    return null;
		
		
	}
	

}
