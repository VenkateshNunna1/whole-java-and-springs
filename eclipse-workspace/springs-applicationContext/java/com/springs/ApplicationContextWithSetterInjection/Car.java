package com.springs.ApplicationContextWithSetterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
   private int id;
   private String carname;
   private String model;
   private int yor;
   private double price;
   private Engine engine;
		public Engine getEngine() {
		return engine;
	}
		@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public int getId() {
		return id;
	}
	@Value("1")
	public void setId(int id) {
		this.id = id;
	}
	public String getCarname() {
		return carname;
	}
	@Value("Audi")
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getModel() {
		return model;
	}
	@Value("Q7")
	public void setModel(String model) {
		this.model = model;
	}
	public int getYor() {
		return yor;
	}
	@Value("2022")
	public void setYor(int yor) {
		this.yor = yor;
	}
	
	public double getPrice() {
		return price;
	}
	@Value("34000")
	public void setPrice(double price) {
		this.price = price;
	}
   
   
}
