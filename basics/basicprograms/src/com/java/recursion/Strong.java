package com.java.recursion;

public class Strong {

	public static void main(String[] args) {
	int n=145;
	int a=strong(n);
    if(a==n) {
    	System.out.println("Strong number");
    }
    else {
    	System.out.println("not a strong");
    }

	}
	 static int sum=0;
	static int strong(int n) {
		if(n<=0) {
			return sum;
		}
		int rem=n%10;
		int fact=fact(rem);
		sum=sum+fact;
		n=n/10;
		return strong(n);
		
		
	}
	static int fact(int n) {
		if(n==0) {
			return 1;
		}
		return n*fact(n-1);
	}

}
