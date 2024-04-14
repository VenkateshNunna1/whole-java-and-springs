package com.java.recursion;

public class length {

	public static void main(String[] args) {
		int n=123456;
		int a=length(n);
        System.out.println(a);
	}	public static int length(int n) {
		if(n<=0) {
			return 0;
		}
		return 1+length(n/10);
	}

}
