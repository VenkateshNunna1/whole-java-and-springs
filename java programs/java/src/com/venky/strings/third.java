package com.venky.strings;
import java.util.Scanner;

public class third {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s =in.next();
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		for(int i=s.length()-1;i>=0;i--) {
			char c = s.charAt(i);
			 System.out.println(c);
			 
			
		}
	}

}
