package com.springs.ApplicationContextWithSetterInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pen {
  private int id;
  private String company;
		public int getId() {
			return id;
		}
		@Value("1")
		public void setId(int id) {
			this.id = id;
		}
		public String getCompany() {
			return company;
		}
		@Value("cello")
		public void setCompany(String company) {
			this.company = company;
		}
  
}
