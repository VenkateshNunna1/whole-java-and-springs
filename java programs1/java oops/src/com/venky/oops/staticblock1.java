package com.venky.oops;

public class staticblock1 {
	int j;
	static int i;
	static {
		System.out.println("sb1 for a");
	}
	{
		j=78;
		System.out.println("nsb1 for a");
	}
	{
		i=100;
		System.out.println("nsb2 for a");
		
	}
	public static void main(String args[]) {
	  staticblock1 s = new staticblock1();
	  staticblock1 s1 = new staticblock1();
	  System.out.println(s1.j);
	  System.out.println(staticblock1.i);
	  staticblock1.i=67;
	  System.out.println(staticblock1.i);
	}
}
