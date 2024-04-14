package com.venky.functionrecursion;

public class sum {

	public static void main(String[] args) {
		sum(12345);
	}
	static int sum;
	   static void sum(int i) {
		if(i==0) {
		System.out.println(sum);
		return;
		}
	    int rem=i%10;
	    sum=sum+rem;
	    i=i/10;
	    sum(i);
   }
}
