package com.springs.applicationcontextWithConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Tv {
 int id;
 String brand;;
 double price;
 Remote remote;
	public Tv(@Value("1") int id,@Value("samsung") String brand,@Value("46000") double price,@Autowired Remote remote) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.remote = remote;
	}
 
}
