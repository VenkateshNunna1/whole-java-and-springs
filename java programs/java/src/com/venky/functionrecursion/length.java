package com.venky.functionrecursion;

public class length {

	public static void main(String[] args) {
		int a = length(12345);
		System.out.println(a);

	}
	static int count;
	static int length(int i) {
		if(i<=0) return count;
		count++;
		i=i/10;
		return length(i);
	}

}
