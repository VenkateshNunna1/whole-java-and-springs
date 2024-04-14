package com.venky.functionrecursion;

public class kunal6 {

	public static void main(String[] args) {
	  String s1 =reverse(12345);
	  System.out.println(s1);
	}
	static String s=" ";
    static String reverse(int n) {
    	if(n<=0) return s;
    	int rem=n%10;
    	s=s+rem;
    	n=n/10;
    	return reverse(n);
    	
    	
    }
}
