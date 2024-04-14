package com.venky.oops;
import java.util.Scanner;
public class car {
	int carno;
	String carname;
	String color;
	void getcar(int carno,String cname,String color){
		this.carno=carno;
	    this.carname=cname;
	    this.color=color;
	}
	void carshow() {
		System.out.println("carno:"+carno);
		System.out.println("carname:"+carname);
		System.out.println("color of the car:"+color);
	}
	
    void factorymethod() {
    	Scanner in = new Scanner(System.in);
    	System.out.println("enter the carno:");
    	int n =in.nextInt();
    	System.out.println("enter the carname:");
    	String x =in.next();
    	System.out.println("enter the color of the car:");
    	String y =in.next();
    	car c = new car();
    	c.getcar(n, x, y);
    	c.carshow();
    	
    }
    public static void main(String args[]) {
    	car c = new car();
    	c.factorymethod();
    }
}
