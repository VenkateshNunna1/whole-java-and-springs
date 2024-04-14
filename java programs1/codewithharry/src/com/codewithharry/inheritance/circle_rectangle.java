package com.codewithharry.inheritance;
import java.util.Scanner;
class circle{
 double radius;
	void m1(double radius){
		this.radius=radius;
	}
	void showarea() {
	double area=3.14*radius*radius;
		System.out.println("the area of circle:"+area);
	}
}
class rectangle extends circle{
    double height;
      void getarea(double height) {
    	  this.height=height;
      }
      void showarea1 () {
    	  double area1=2*3.14*this.radius*height+2*3.14*this.radius*this.radius;
    	  System.out.println("the area of cylinder:"+area1);
      }
       static void factorymethod() {
    	  Scanner in = new Scanner(System.in);
    	  System.out.println("enter the radius:");
    	  int r = in.nextInt();
    	  System.out.println("enter the height:");
    	  int h = in.nextInt();
    	  rectangle r1 = new rectangle();
    	  r1.m1(r);
    	  r1.showarea();
    	  r1.getarea(h);
    	  r1.showarea1();
    	  
      }
		
}
class circle_rectangle{
	public static void main(String args[]) {
		rectangle.factorymethod();
	}
}