package com.venky.strings;
import java.util.Scanner;
public class charat {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String s1="";
		//reverse of string 
		/*for(int i=s.length()-1;i>=0;i--) {
			char c = s.charAt(i);
			s1=s1+c;
		}
		System.out.println(s1);*/
		char[] c = s.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			s1=s1+c[i];
		}
		System.out.println(s1);
	}

}
