package com.venky.functionrecursion;

public class reverse {

	public static void main(String[] args) {
	  reverse(123);
	}
	static int rev=0;
	static void reverse(int n) {
		if(n<=0) {
			System.out.println(rev);
			return;
		}
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		reverse(n);
	}

}
