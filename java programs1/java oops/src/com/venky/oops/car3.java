package com.venky.oops;

import java.util.Scanner;
public class car3 {
	static int carno=1001;
	String carname;
	String carcolor;
	car3(String carn,String carc){
		carname=carn;
		carcolor=carc;
	}
	void showcar() {
		System.out.println("rc of the car:"+carno);
		carno++;
		System.out.println("the name of the car:"+carname);
		System.out.println("the color of the car:"+carcolor);
		System.out.println("******************************************************************");
	}
	   static car3 factorymethod() {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the name of the car:");
		String s = in.nextLine();
		System.out.println("enter the color of the car:");
		String y = in.nextLine();
		car3 c = new car3(s,y);
		c.showcar();
		return c;
	}

	public static void main(String[] args) {
		  car3 c =car3.factorymethod();
		  car3 d = car3.factorymethod();

	}

}
