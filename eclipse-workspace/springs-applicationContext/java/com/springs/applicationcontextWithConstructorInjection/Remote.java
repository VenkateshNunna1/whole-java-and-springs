package com.springs.applicationcontextWithConstructorInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Remote {
	   int id;
	   int warranty;
	 public Remote(@Value("1") int id,@Value("5") int warranty) {
		this.id = id;
		this.warranty = warranty;
	 }
	 public void work() {
		 System.out.println("lg remote was made in japan");
	 }
   
}
