package com.venky.oops;
import java.util.Scanner;
class student{
	int id;
	String name;
	int marks;
	String fathername;
	public student(int id, String name, int marks, String fathername) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.fathername = fathername;
	}
	void stddet() {
		System.out.println("the id of the student:"+id);
		System.out.println("the name of the student:"+name);
		System.out.println("the marks of the student:"+marks);
		System.out.println("the father of the student:"+fathername);
		
	}
     static student  factorymethod() {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the id:");
		int i = in.nextInt();
		System.out.println("enter the name:");
		String n = in.next();
		System.out.println("enter the marks:");
		int m = in.nextInt();
		System.out.println("enter the father name:");
		String f = in.next();
		student s = new student(i,n,m,f);
		s.stddet();
		return s;
		
	}
	
}
public class factorymethod {

	public static void main(String[] args) {
		student s1 = student.factorymethod();
		student s2 = student.factorymethod();

	}

}
