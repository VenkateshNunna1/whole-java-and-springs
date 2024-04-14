package com.venky.strings;
import java.util.Scanner;
public class seocond {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a string");
		String s = in.next();
		System.out.println("enter index number");
		int i = in.nextInt();
		System.out.println(s.charAt(i));
		System.out.println(s.length());
		for(int j=0;j<s.length();j++) {
		  char	c = s.charAt(j);
			System.out.print(c);

		}
		
		

	}

}
