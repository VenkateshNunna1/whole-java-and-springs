package com.springs.applicationcontextWithConstructorInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("markers")//@component annotation is used to specify beans(pojo classes) to spring ioc container.
//@component is used to mark a class as component class.
//in application context class name should be taken as bean id.here we will change the class name explictly using @component("give class name")  annotation
public class Marker {
     int id;
     String brand;
     double price;
	public Marker(@Value("1")int  id,@Value("cello") String brand,@Value("25")double price) {
		this.id = id;
		this.brand = brand;
		this.price = price;
	}
     
}
