package com.java.recursion;

public class Sumofgivennumbers {

	public static void main(String[] args) {
		int n=12345;
		int a=sum(n);
		System.out.println(a);

	}
	
	static int sum=0;
	static int sum(int n) {
		if(n<=0) {
			return sum ;
		}
		sum=sum+ n%10;
		n=n/10;
		return sum(n);
		
		
		
	}

}
