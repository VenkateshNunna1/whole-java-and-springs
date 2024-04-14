package com.java.recursion;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
	     int base=in.nextInt();
	     int exponent = in.nextInt();
	     int power=isPower(base,exponent);
	     System.out.println(power);

	}
	 static int mul=1;
	static int isPower(int base,int exponent) {
		if(exponent<=0) {
			return mul;
		}
		mul=mul*base;
		return isPower(base,exponent-1);
		
	}

}
