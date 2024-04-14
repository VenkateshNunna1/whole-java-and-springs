package com.venky.functionrecursion;

public class kunal7 {

	public static void main(String[] args) {
		int a= palindrome(121);
		System.out.println(a);

	}
	static int sum=0;
	static int palindrome(int n) {
		if(n==0)return sum;
		int rem=n%10;
		sum=sum*10+rem;
		n=n/10;
		return palindrome(n);
	}

}
