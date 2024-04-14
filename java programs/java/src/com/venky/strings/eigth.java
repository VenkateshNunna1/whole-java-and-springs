package com.venky.strings;
import java.util.Scanner;
class eigth{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s =in.next();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='A'&&c<='Z') {
				   c= (char) (c+32);
				  
			}
			else {
			      c=(char) (c-32);
			}
			System.out.print(c);
				
			}
		
		}
		
	}
