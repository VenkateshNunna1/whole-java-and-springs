package com.venky.abstract1;
import java.util.Scanner;
abstract class studenttemplate{
	int phnno;
	String name;
	String fathername;
	String mothername;
	 
	public studenttemplate(int phnno, String name, String fathername, String mothername) {
		this.phnno = phnno;
		this.name = name;
		this.fathername = fathername;
		this.mothername = mothername;
	}

	abstract void showdetails();
	
}
class student extends studenttemplate{

	
	public student(int phnno, String name, String fathername, String mothername) {
		super(phnno, name, fathername, mothername);
		
	}
	@Override
	void showdetails() {
		System.out.println("the father no:"+phnno);
		System.out.println("the name of the student:"+name);
		System.out.println("the father of the student:"+fathername);
		System.out.println("the mother of the student:"+mothername);
	}
	static student factory() {
		Scanner in =new Scanner(System.in);
		System.out.println("enter the father phn no:");
		int r = in.nextInt();
		System.out.println("the name of the student:");
		String n = in.next();
		System.out.println("the father of the student:");
		String f = in.next();
		System.out.println("the mother of the student:");
		String m = in.next();
		 student s = new student(r,n,f,m);
		 s.showdetails();
		 return s;
		}
	
}
public class test3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("how many no of students would you like join in the school?");
	     int l = in.nextInt();
	     for(int i=1;i<=l;i++) {
	    	 System.out.println("enter the "+i+ " student details :");
		    student s1=student.factory();
	     }
	}

}
