package com.spring.constructorinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PhoneDriver {

	public static void main(String[] args) {
		ClassPathResource cpr = new ClassPathResource("core.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		Phone phone =(Phone) bf.getBean("mobile");
		System.out.println("---------------------Mobile phone details----------------");
		System.out.println(phone.id);
		System.out.println(phone.brand);
		System.out.println(phone.model);
		System.out.println(phone.price);
		System.out.println("---------------------sim card details--------------------");
		Sim sim = phone.sim;
		System.out.println(sim.id);
		System.out.println(sim.brand);
		System.out.println(sim.type);
	}

}
