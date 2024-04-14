package com.venky.strings;
import java.util.Scanner;
public class fifth {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s =in.next();
		int sum=0;
		for(int i=0;i<s.length();i++) {
		 char c = s.charAt(i);
		  if(c>='0'&&c<='9') {
			  int a =/*Character.getNumericValue(c)*/ c-'0';
			 sum=sum+a; 
		  }
		}
		System.out.println(sum);

	}

}
