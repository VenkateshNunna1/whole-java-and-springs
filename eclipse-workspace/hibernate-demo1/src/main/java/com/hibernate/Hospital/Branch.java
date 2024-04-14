package com.hibernate.Hospital;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Branch {
	@Id
	 private int bId;
	 private String bName;
	 private String bManager;
	 @ManyToOne
	 private Hospital hospital;
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbManager() {
		return bManager;
	}
	public void setbManager(String bManager) {
		this.bManager = bManager;
	}
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	
	
	 
	 
}
