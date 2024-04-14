package com.hibernate.login;

import java.util.Scanner;

public class UseDriver {

	public static void main(String[] args) {
		User user = new User();
		UserDao ud = new UserDao();
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter id:");
		int id = in.nextInt();
		System.out.println("enter name");
		String name = in.next();
		System.out.println("enter email");
		String email = in.next();
		System.out.println("enter password:");
		String password = in.next();
		
		user.setId(id);
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		 ud.savedata(user);

	}

}
