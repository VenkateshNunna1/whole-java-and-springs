package com.venky.oops;

public class car1 {
	  static int carno;//static int carno=1000;
	  static
	     {
		carno=1000;
	     }
	String carname;
	String carcolor;
	car1(String carn,String carc){
		this.carname=carn;
		this.carcolor=carc;
	}
	void showcar() {
		System.out.println("the no of the car:"+carno);
		carno++;
		System.out.println("the name of the car:"+carname);
		System.out.println("the color of the car:"+carcolor);
		System.out.println("*****************************************");
		
	}
	

	public static void main(String[] args) {
		car1 c = new car1("benz m3","yellow");
		c.showcar();
		car1 c1 = new car1("benz m3","yellow");
		c1.showcar();
	}

}
