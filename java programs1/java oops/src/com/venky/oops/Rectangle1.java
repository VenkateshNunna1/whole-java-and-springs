package com.venky.oops;
import java.util.Scanner;
public class Rectangle1 {
  int length;
  int breadth;
  Rectangle1(int length,int breadth){
	  this.length=length;
	  this.breadth=breadth;
  }
  Rectangle1(int side){
	  this(side,side);
  }
 int Area() {
	  int area=length*breadth;
	  System.out.print("the area of rectangle is:");
	  return area;
  }
 int perimeter() {
	 int perimeter = 2*(length+breadth);
	 System.out.print("the perimeter of rectangle is:");
	 return perimeter;
 }
 void design() {
	 System.out.println("**********************************************");
 }
 void factorymethod() {
	 Scanner in = new Scanner(System.in);
	 System.out.print("input the values of length and breadth for rectangle:");
	 int r = in.nextInt();
	 Rectangle1 r1 = new Rectangle1(r);
	 System.out.println(r1.Area());
	 System.out.println(r1.perimeter());
	 r1.design();
 }
 public static void main(String args[]) {
	 Rectangle1  r2 = new Rectangle1(90);
	 r2.factorymethod();
	
 }
}
