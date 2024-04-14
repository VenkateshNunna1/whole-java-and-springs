package com.venky.oops;

import java.util.Scanner;

public class student2 {
	int id;
    String name;
    int marks;

    student2(int id,String name,int marks){
   	 this.id=id;
   	 this.name=name;
   	 this.marks=marks;
   	 
    }
    void show() {
   	 System.out.println("the id of the student:"+id);
   	 System.out.println("the name of the student:"+name);
   	 System.out.println("the marks of the student:"+marks);
    }
    static student2 factorymethod() {
   	Scanner in = new Scanner(System.in);
   	System.out.println("enter the id of the student:");
   	int n =in.nextInt();
   	System.out.println("enter the name of the student:");
   	String name = in.next();
   	System.out.println("enter the marks of the student:");
   	int marks=in.nextInt();
   	student2 s = new student2(n,name,marks);
   	s.show();
    return s;
   	
    }
	public static void main(String[] args) {
		student2 s1= student2.factorymethod();
		System.out.println(s1);
		
		

	}

}
