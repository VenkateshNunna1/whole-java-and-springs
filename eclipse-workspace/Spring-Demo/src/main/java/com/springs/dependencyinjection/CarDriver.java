package com.springs.dependencyinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CarDriver {

	public static void main(String[] args) {
	  ClassPathResource cpr = new ClassPathResource("springcore.xml");
	  BeanFactory bf = new XmlBeanFactory(cpr);
	 Car c= (Car) bf.getBean("mycar");
	  Engine e =c.getEngine();
	  e.work();

	}

}
