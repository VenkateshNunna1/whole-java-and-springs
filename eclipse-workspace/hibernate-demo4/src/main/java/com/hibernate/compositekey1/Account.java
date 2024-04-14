package com.hibernate.compositekey1;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	  
	 private int id;
	 private String name;
	 @EmbeddedId//it is used to mark a composite key for a entity class
	 private AccountPk accountpk;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AccountPk getAccountpk() {
		return accountpk;
	}
	public void setAccountpk(AccountPk accountpk) {
		this.accountpk = accountpk;
	}
	 
	 
 
}
