package com.hibernate.joinTableAnnotation;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String name;
   private String ceo;
   @Cascade(CascadeType.ALL)
   @OneToMany
   @JoinTable(name = "companydetails",joinColumns = @JoinColumn(name="companies"),inverseJoinColumns = @JoinColumn(name="employees"))
   private List<Employee> employees;
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
