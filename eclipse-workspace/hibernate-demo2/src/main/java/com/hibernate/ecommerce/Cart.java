package com.hibernate.ecommerce;

import java.util.List;

import javax.persistence.OneToMany;

public class Cart {
  private int id;
  private String name;
  private double totalPrice;
  @OneToMany
  private List<Item> item;
  
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
		public double getTotalPrice() {
			return totalPrice;
		}
		public void setTotalPrice(double totalPrice) {
			this.totalPrice = totalPrice;
		}
		public List<Item> getItem() {
			return item;
		}
		public void setItem(List<Item> item) {
			this.item = item;
		}
		
  
}
