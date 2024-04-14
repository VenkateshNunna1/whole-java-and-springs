package com.venky.oops;

public class Rectangle {
	int length;
	int breadth;
	Rectangle(int l,int b) {
		this.length=l;
		this.breadth=b;
	}
	  void Area() {
		  int area=length*breadth;
		  System.out.println("area of the Rectangle:"+area);
	  }
	  void perimeter() {
		  int perimeter=2*(length+breadth);
		  System.out.println("perimeter of the rectangle:"+perimeter);
	  }
	  void design() {
		  System.out.println("******************************************************");
	  }

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(12,17);
		r1.Area();
		r1.perimeter();
		r1.design();
		Rectangle r2 = new Rectangle(15,14);
		r2.Area();
		r2.perimeter();
		r2.design();
		
	}

}
