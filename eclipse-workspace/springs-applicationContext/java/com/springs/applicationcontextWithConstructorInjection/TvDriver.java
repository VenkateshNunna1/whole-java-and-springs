package com.springs.applicationcontextWithConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvDriver {
    public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springs.xml");
	    Tv t=(Tv) ac.getBean("tv");
	    System.out.println("-------------tv details---------------");
		System.out.println(t.id);
		System.out.println(t.brand);
		System.out.println(t.price);
		System.out.println("------------remote details------------");
		Remote remote = t.remote;
		System.out.println(remote.id);
		System.out.println(remote.warranty);
		remote.work();
	}
} 
