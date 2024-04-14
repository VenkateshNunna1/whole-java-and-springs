package com.venky.strings;
import java.util.Scanner;
public class fourth {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String s = in.nextLine();
	int count=0;
	System.out.println(s.length());
	for(int i=0;i<s.length();i++) {
		char c = s.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			count++;
		}
	}
	System.out.println(count);

	}

}
