package com.venky.encapsulation;

class Student1{
	  
private	int age;
  private int id;
	private String name;
	private int marks;
	
	public Student1(int age, int id, String name, int marks) {
		super();
		this.age = age;
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
class test1{
	public static void main(String args[]) {
		Student1 s = new Student1(17,77,"venky",98);
		System.out.println(s.getAge());
		System.out.println(s.getId());
		System.out.println(s.getMarks());
		System.out.println(s.getName());
		
	}
}