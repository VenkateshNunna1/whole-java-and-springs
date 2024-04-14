package com.venky.oops;
 class a11{
	 a11(){
		 System.out.println(" non- parameterized constructor of A11 class ");
	 }
	 a11(int i){
		 System.out.println("parameterized constructor of A11 class");
	 }
 }
 class b11 extends a11{
	 b11(){
		 System.out.println(" non- parameterized constructor of B11 class ");
	 }
	 b11(int i){
		 super(i);
		 System.out.println("parameterized constructor of B11 class");
		
	 }
 }
public class Super1 {

	public static void main(String[] args) {
		b11 b = new b11();
		b11 b1 = new b11(11);

	}

}
