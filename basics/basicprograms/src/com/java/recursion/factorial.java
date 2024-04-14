package com.java.recursion;

public class factorial {

	public static void main(String[] args) {
		int n=5;
		int a=fact(n);
		System.out.println(a);
	}
      static	int fact=1;
	static int fact(int n) {
		if(n==0) {
			return fact;
		}
		fact=fact*n;
		return fact(n-1);
	}

}
