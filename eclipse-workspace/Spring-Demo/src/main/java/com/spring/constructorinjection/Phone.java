package com.spring.constructorinjection;

public class Phone {
   int id;
   String brand;
   String model;
   double price;
   Sim sim;
	public Phone(int id, String brand, String model, double price, Sim sim) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.sim = sim;
	}
   
}
