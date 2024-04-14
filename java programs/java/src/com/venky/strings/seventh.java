package com.venky.strings;
import java.util.Scanner;
public class seventh {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String s =in.next();
	int count=0;
	int count1=0;
	for(int i=0;i<s.length();i++) {
		char c =s.charAt(i);
		if(c>='A'&&c<='Z') {
			count++;
		}
		else {
			count1++;
		}
	}
	System.out.println("the capital letters count are:"+count);
    System.out.println("the small letter count are:"+count1);
	}

}
