package com.jsp.hibernate_demo;

import java.util.Scanner;

public class StudentController {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean b=true;
		StudentDao sa = new StudentDao();
		while(b) {
			System.out.println("1.save student 2.view student");
			System.out.println("3.delete student 4.exit");
			System.out.println("choose the option above");
			int option =in.nextInt();
			switch(option){
			case 1:{
				System.out.println("enter id:");
				int id = in.nextInt();
				System.out.println("enter name:");
				String name = in.next();
				System.out.println("enter age");
				int age =in.nextInt();
			    System.out.println("enter phonenumber:");
			    long phonenumber = in.nextLong();
			    Student student = new Student();
			      student.setId(id);
			      student.setName(name);
			      student.setAge(age);
			      student.setPhonenumber(phonenumber);
			      sa.savedata(student);
			      
			}
			break;
			case 2:{
				System.out.println("enter which id details you want to fetch/view:");
				int id = in.nextInt();
				Student student=sa.finddata(id);
				    if(student!=null) {
				    	System.out.println(student.getName());
				    	System.out.println(student.getAge());
				    	System.out.println(student.getPhonenumber());
				    }
				    else {
				    	System.out.println("enter valid id");
				    }
			}
			break;
			case 3:{
				System.out.println("enter which user id details you want to delete:");
				int id = in.nextInt();
				Student s = sa.finddata(id);
				sa.deletedata(id, s);
				//sa.deletedata(id);
			}
			break;
			case 4:{
				b=false;
			}
			break;
			default:{
				System.out.println("enter valid option");
			}
			}
		}

	}

}
