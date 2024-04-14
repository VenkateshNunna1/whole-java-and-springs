package com.venky.upcasting;
class car{

}
class audi extends car{
	
}
class benz extends car{
	
}
class alto extends car{
	
}
class drive{
	void m1(car c) {
		System.out.println("car stared");
		
	}
}
public class car1 {

	public static void main(String[] args) {
		car c = new audi();
		car c1 = new benz();
		drive d = new drive();
		d.m1(c);
		d.m1(c1);
	

	}

}
