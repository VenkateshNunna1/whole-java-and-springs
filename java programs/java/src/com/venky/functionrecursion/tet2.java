package com.venky.functionrecursion;

public class tet2 {

	public static void main(String[] args) {
		m1(1);
		

	}
    static void m1(int i) {
    	
    	if(i>=101) return ;
    	System.out.println("i love java"+i);
    	i=i+1;
    	m1(i);
    	
    }
}
