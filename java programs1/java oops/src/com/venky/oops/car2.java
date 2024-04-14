package com.venky.oops;
import java.util.Scanner;
public class car2 {
	static int carno=1001;
	String carname;
	String carcolor;
	car2(String carn,String carc){
		carname=carn;
		carcolor=carc;
	}
	void showcar() {
		System.out.println("rc of the car:"+carno);
		carno++;
		System.out.println("the name of the car:"+carname);
		System.out.println("the color of the car:"+carcolor);
	}
	   static void factorymethod() {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the name of the car:");
		String s = in.nextLine();
		System.out.println("enter the color of the car:");
		String y = in.nextLine();
		car2 c = new car2(s,y);
		c.showcar();
	}

	public static void main(String[] args) {
		  car2.factorymethod();

	}

}
