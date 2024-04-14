package com.venky.oops;

public class staticblocks {
	  static int i=90; 

	static  
	{
		i=18;
		System.out.println("venky nunna");
		i=49;
		System.out.println(i);
	}
	static {
		System.out.println("venky nunna");
	}
	public static void main(String args[]) {
		staticblocks s =new staticblocks();
		System.out.println(s.i);
	}
}
