package com.hibernate.login;

import java.util.List;
import java.util.Scanner;

public class UserDriver1 {

	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);
	   User user = new User();
	   UserDao1 ud = new UserDao1();
	   System.out.println("enter email:");
	   String email = in.next();
	   System.out.println("enter password:");
	   String password = in.next();
	   List<User> l=ud.validateDataDynamically(email, password);
	   if(l.size()>0) {
		   System.out.println("welcome to the web page");
	   }
	   else {
		   System.out.println("invalid, Credentials");
	   }

	}

}
