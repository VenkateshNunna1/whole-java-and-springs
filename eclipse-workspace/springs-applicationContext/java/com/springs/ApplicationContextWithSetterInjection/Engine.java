package com.springs.ApplicationContextWithSetterInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
  private int id;
  private int cc;
	public int getId() {
		return id;
	}
	@Value("1")
	public void setId(int id) {
		this.id = id;
	}
	public int getCc() {
		return cc;
	}
	@Value("200")
	public void setCc(int cc) {
		this.cc = cc;
	}
  
}
