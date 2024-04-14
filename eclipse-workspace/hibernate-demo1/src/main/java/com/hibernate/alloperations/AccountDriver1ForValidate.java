package com.hibernate.alloperations;

import java.util.Scanner;

public class AccountDriver1ForValidate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter accountnumber:");
		long accountnumber = in.nextLong();
		System.out.println("enter pincode");
		long pincode =in.nextLong();
		AccountDao ad = new AccountDao();
		Account account= ad.validateByAccountNoAndPassword(accountnumber, pincode);
		 if(account!=null) {
			  System.out.println("welcome");
		  }
		  else {
			  System.out.println("invalid credentials");
		  }

	}

}
