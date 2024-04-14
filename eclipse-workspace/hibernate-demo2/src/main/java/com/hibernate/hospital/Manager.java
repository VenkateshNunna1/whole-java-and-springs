package com.hibernate.hospital;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Manager {
	 @Id
   private int id;
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
	public String getGraduation() {
		return graduation;
	}
	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}
	public String getYoe() {
		return yoe;
	}
	public void setYoe(String yoe) {
		this.yoe = yoe;
	}
private String name;
   private String graduation;
   private String yoe;
}
