package com.java.recursion;

public class Armstrong {

	public static void main(String[] args) {
	int n=153;
	 int a=isArmstrong(n);
	 if(a==n) {
		 System.out.println("Armstrong");
	 }
	 else {
		 System.out.println("not  an armstrong");
	 }

	}
	static int sum=0;
	static int isArmstrong(int n) {
		if(n<=0) {
			return sum;
		}
		int rem=n%10;
		int length=count(rem);
		sum=sum+power(rem,length);
		n=n/10;
		return isArmstrong(n);
		
	}
	static int count=0;
	static int count(int n) {
		if(n<=0) {
			return count;
		}
		count++;
		n=n/10;
		return count(n);
	}
	static int mul=1;
	static int power(int base,int exponent) {
		if(exponent==0) {
			return mul;
		}
		mul=mul*base;
		return power(base,exponent-1);
	}

}
