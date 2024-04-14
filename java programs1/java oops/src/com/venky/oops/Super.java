package com.venky.oops;
class N{
	N(){
	System.out.println("constructor of N class");	
	}
}
class B extends N{
	B(){
		//super(); by default compiler generates the call to super()for the first line of constructor
		System.out.println("constructor of b class");
	}
}
public class Super {
     

	public static void main(String[] args) {
     B b1 = new B();		

	}

}
