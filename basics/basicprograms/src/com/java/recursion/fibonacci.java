package com.java.recursion;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
	int a = fibo(n);
	System.out.println(a);
		

	}
	static int temp=0;
	static int fibo(int n) {
		if(n<2) {
			return n;
		}
	return	fibo(n-1)+fibo(n-2);
		
	}

}
