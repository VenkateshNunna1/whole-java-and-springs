package com.hibernate.login;

import java.util.Scanner;

public class UserDriver2 {

	public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 System.out.println("enter email:");
	 String email = in.next();
	 System.out.println("enter password");
	 String password = in.next();
	 User user = new User();
	 UserDao2 ud = new UserDao2();
	  User u = ud.findByEmailAndPassword(email, password);
	  if(u!=null) {
		  System.out.println("welcome");
	  }
	  else {
		  System.out.println("invalid credentials");
	  }

	}

}
