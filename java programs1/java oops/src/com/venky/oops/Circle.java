package com.venky.oops;

public class Circle {
	double radius;
	static int count;
	void getradius(double r) {
		this.radius=r;
	}
	void area() {
		double area = 3.14*radius*radius;
		System.out.println("area of circle is:"+area);
	}
	void circumference() {
		double circum=2*3.14*radius;
		System.out.println("circumference of circle:"+ circum);
	}
	 static void design() {
		System.out.println("************************************");
		count=count+1;
		System.out.println(count);
	}

	public static void main(String[] args) {
		
       Circle c1 = new Circle();
       c1.getradius(9);
       c1.area();
       c1.circumference();
      Circle.design();
      Circle c2 = new Circle();
      c2.getradius(19);
      c2.area();
      c2.circumference();
      
      Circle.design();
	}

}
