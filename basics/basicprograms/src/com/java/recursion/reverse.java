package com.java.recursion;

public class reverse {

	public static void main(String[] args) {
		int n=45678;
		int rev=reverse(n);
		System.out.println(rev);

	}
	static int rev=0;
	static int reverse(int n) {
		if(n<=0) {
			return rev;
		}
		int rem=n%10;
		 rev=rev*10+rem;
		 n=n/10;
		 return reverse(n);
		
	}

}
