package com.java.recursion;

public class prime {
   public static void main(String[] args) {
    boolean c=isPrime(30,2);
    if(c) {
    	System.out.println("prime");
	}
    
    else {
    	System.out.println("not prime");
    }
}   
   static boolean isPrime(int n,int i) {
	   if(i>=n/2) {
		   return true;
	   }
	   if(n%i==0) {
		   return false;
	   }
	   return isPrime(n,i+1);
   }
}
