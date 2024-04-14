package com.venky.privateconstructor;
class A{
      private  A() {
		System.out.println("private constructor");
	}
	public static  A m1() {  //with the help of private constructor we can create n no of objects within a class
		A a = new A();
		return a;
	}
}
public class test1 {

	public static void main(String[] args) {
	   //A a = new A();
         A a1 = A.m1();//here every reference not pointing towards same object
         A a2 =A.m1();
         System.out.println(a1==a2);
	}

}
