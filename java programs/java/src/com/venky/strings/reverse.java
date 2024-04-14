package com.venky.strings;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the string");
		String s = in.nextLine();
		String s1=" ";
		for(int i=s.length()-1;i>=0;i--) {
			char c =s.charAt(i);
			s1=s1+c;
		}
		System.out.println("reverse of a string :"+s1);

	}

}
