package com.venky.objectclass;
class student{
	int rollno;
	String name;
	int marks;
	String fathersname;
	public student(int rollno, String name, int marks, String fathersname) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.fathersname = fathersname;
	}
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", fathersname=" + fathersname
				+ "]";
	}
	
}
public class tostring1 {

	public static void main(String[] args) {
		student s = new student(10,"venkatesh",78,"peraiah");
		System.out.println(s);

	}

}
