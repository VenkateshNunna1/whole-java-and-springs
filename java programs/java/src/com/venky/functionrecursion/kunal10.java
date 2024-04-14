package com.venky.functionrecursion;

public class kunal10 {

	public static void main(String[] args) {
	
      int a= add(12345);
      System.out.println(a);
	}
	static int sum;
	static int add(int n) {
		if(n==0) {
			return 0;
		}
		if(n>0) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		if(sum>9)
		 return add(n);
		return sum;
	}

}
