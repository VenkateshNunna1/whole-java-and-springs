package com.hibernate.OneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
	@Id
   private int CompanyId;
   private String CompanyName;
   private  String ceo;
   @OneToMany
   private List<Employee> employees;
	
		public int getCompanyId() {
		return CompanyId;
	}
		
	public void setCompanyId(int companyId) {
		CompanyId = companyId;
	}
	
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
}
   
   
   
}
