package com.hibernate.Hospital;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Hospital {
	@Id
  private int hId;
  private String hName;
  private String ceo;
  @OneToMany
  private List<Branch> branches;
public int gethId() {
	return hId;
}
public void sethId(int hId) {
	this.hId = hId;
}
public String gethName() {
	return hName;
}
public void sethName(String hName) {
	this.hName = hName;
}
public String getCeo() {
	return ceo;
}
public void setCeo(String ceo) {
	this.ceo = ceo;
}
public List<Branch> getBranches() {
	return branches;
}
public void setBranches(List<Branch> branches) {
	this.branches = branches;
}
  
  

	   
}
