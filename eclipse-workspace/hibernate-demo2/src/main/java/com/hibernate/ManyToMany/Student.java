package com.hibernate.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Student {
	@Id
  private int id;
  private String name;
  private int yop;
  @ManyToMany
  private List<Course> courses;
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
		public int getYop() {
			return yop;
		}
		public void setYop(int yop) {
			this.yop = yop;
		}
		public List<Course> getCourses() {
			return courses;
		}
		public void setCourses(List<Course> courses) {
			this.courses = courses;
		}
  
}
