package com.venky.strings;
import java.util.Scanner;
public class first {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1="venky";//implictly created string object  in the heap memory
		String s2="venky";
		System.out.println(s1==s2);//comparsion based on addresss
		System.out.println(s1.equals(s2));//comparision based on the values
		String s3 = new String("venky");
		String s4 = new String("venky");
		System.out.println(s3==s4);//comparision based on address
		System.out.println(s3.equals(s4));//comparision based on the values
	}

}
