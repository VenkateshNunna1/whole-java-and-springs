package com.venky.functionrecursion;

public class kunal8 {

	public static void main(String[] args) {
		int a = count(1900000001);
		System.out.println(a);

	}
	static int count1=0;
	static int count(int n) {
		if(n<=0)return count1;
		int rem=n%10;
		if(rem==0) {
			count1++;
		}
		n=n/10;
		return count(n);
		
	}

}
