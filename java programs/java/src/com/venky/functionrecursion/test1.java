package com.venky.functionrecursion;

public class test1 {
	static int m1(int i) {
		if(i>=100) return i;
		System.out.println(i);
		i++;
		return m1(i);
	}
  public static void main(String args[]) {
	    int i=1;
	   int a = m1(i);
	   System.out.println(a);
  }
}
