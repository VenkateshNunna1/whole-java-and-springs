package com.hibernate.hospital;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {
	 @Id
   private int id;
   private String name;
   private String specialization;
   private String yoe;
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
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getYoe() {
		return yoe;
	}
	public void setYoe(String yoe) {
		this.yoe = yoe;
	}		
   		
}
