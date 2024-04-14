package com.springs.dependencyinjection1;

public class MobilePhone {
   private int mid;
   private String brand;
   private double price;
   private Battery battery;
	
	public int getMid() {
	return mid;
}
  public void setMid(int mid) {
	this.mid = mid;
}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Battery getBattery() {
		return battery;
	}
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	      
}
