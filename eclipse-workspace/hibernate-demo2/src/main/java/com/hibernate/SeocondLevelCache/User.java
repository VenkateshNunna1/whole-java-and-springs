package com.hibernate.SeocondLevelCache;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable // it is used to specify the seocond level cache momory.this annotation used in all operations.then,it will decrease the performance of application
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class User {
	@Id
  private int id;
  private String name;
  private long mobileNumber;
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
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
  
} 
