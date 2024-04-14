package com.springs.variableInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	@Value("1")
     int id;
	@Value("asus laptop")
    String name;
	@Value("45000")
    double price;
   
}
