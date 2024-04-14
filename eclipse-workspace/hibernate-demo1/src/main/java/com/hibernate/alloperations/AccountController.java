package com.hibernate.alloperations;

import java.util.Scanner;

public class AccountController {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 AccountDao ad =  new AccountDao();
		 boolean b =true;
		  while(b) {
			  System.out.println("1.Save the data 2.Fetch the data");
			  System.out.println("3.Delete the data 4.Update the data");
			  System.out.println("5.Exit");
			  System.out.println("Choose the above option:");
			  int option = in.nextInt();
			  switch(option) {
				  case 1:{
					  System.out.println("enter id:");
					  int id = in.nextInt();
					  System.out.println("enter name:");
					  String name = in.next();
					  System.out.println("enter mobilenumber:");
					  long mobilenumber = in.nextLong();
					  System.out.println("enter Account Number:");
					  long accountnumber = in.nextLong();
					  System.out.println("enter pincode:");
					  long pincode = in.nextLong();
					  Account account = new Account();
					  account.setId(id);
					  account.setName(name);
					  account.setMobilenumber(mobilenumber);
					  account.setAccountnumber(accountnumber);
					  account.setPincode(pincode);
					  ad.savedata(account);
					  System.out.println("data saved successfully");
				  }
				  break;
				  case 2:{
					  System.out.println("enter id,you would like to view :");
					  int id = in.nextInt();
					   Account account=ad.fetchdata(id);
					   if(account!=null) {
						  System.out.println(account.getId());
						  System.out.println(account.getName()); 
						  System.out.println(account.getMobilenumber());  
						  System.out.println(account.getAccountnumber()); 
						  System.out.println(account.getPincode());
					   }
					   else {
						   System.out.println(" entered id is invalid id,please try again");
					   }
			
				  }
				  break;
				  case 3:{
					  System.out.println("enter id,you want to delete data :");
					  int id = in.nextInt();
					   ad.deletedata(id);
					   System.out.println("Account deleted Successfully");	  
				  }
				  break;
				  case 4:{
					  System.out.println("enter id ,you want to update :");
					  int id =in.nextInt();
					  Account account = ad.fetchdata(id);
					  System.out.println("would you like to update your name?,please enter 1:");
					  System.out.println("would you like to update your mobilenumber?,please enter 2:");
					  System.out.println("would you like to update your Accountnumber?,please enter 3:");
					  System.out.println("would you like to update your pincode?,please enter 4:");
					  int option1 = in.nextInt();
					  switch(option1) {
					  case 1:{
						  System.out.println("enter your name :");
						  String name =in.next();
						account.setName(name);
						ad.updatedate(id,account);
					  }
	                   break;
					  case 2:{
						  System.out.println("enter your mobilenumber:");
						  long mobilenumber =in.nextLong();
						  account.setMobilenumber(mobilenumber);
						  ad.updatedate(id,account);
					  }
					 break;
					  case 3:{
						  System.out.println("enter your accountnumber:");
						  long accountnumber = in.nextLong();
						  account.setAccountnumber(accountnumber);
						  ad.updatedate(id,account);
					  }
					break;
					  case 4:{
						  System.out.println("enter your pincode:");
						  long pincode=in.nextLong();
						  account.setPincode(pincode);
						  ad.updatedate(id,account);
					  }
					  break;
					  default:{
						  System.out.println("enter valid option!");
					  }
					  
					  }
				  }
				  case 5:{
					  b=false;
				  }
				  break;
				  default:{
					  System.out.println("choose valid option");
				  }
				  
			  }
			  
		  }

	}

}
