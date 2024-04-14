package com.venky.oops;
import java.util.Scanner;
public class student {
     int id;
     String name;
     int marks;

     student(int id,String name,int marks){
    	 this.id=id;
    	 this.name=name;
    	 this.marks=marks;
    	 
     }
     void show() {
    	 System.out.println("the id of the student:"+id);
    	 System.out.println("the name of the student:"+name);
    	 System.out.println("the marks of the student:"+marks);
     }
         student() {
    	Scanner in = new Scanner(System.in);
    	System.out.println("enter the id of the student:");
    	int n =in.nextInt();
    	System.out.println("enter the name of the student:");
    	String name = in.next();
    	System.out.println("enter the marks of the student:");
    	int marks=in.nextInt();
    	student s1 = new student(n,name,marks);
    	s1.show();
    	
     }
     public static void main(String args[]) {
    	 student s = new student();
     }
}
