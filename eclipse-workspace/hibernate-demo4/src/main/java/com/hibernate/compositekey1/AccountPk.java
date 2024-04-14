package com.hibernate.compositekey1;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
@Embeddable
public class AccountPk implements Serializable {
	
   private long accountNumber;
   private int pincode;
	public AccountPk(long accountNumber, int pincode) {
		this.accountNumber = accountNumber;
		this.pincode = pincode;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
   
}
