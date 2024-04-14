package com.venky.encapsulation;
class Student{
  
private	int age;
  private int id;
	private String name;
	private int marks;
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
class test{
	public static void main(String args[]) {
		Student s = new Student();
		s.setAge(10);
		s.setId(11);
		s.setMarks(98);
		s.setName("venkatesh");
		System.out.println(s.getAge());
		System.out.println(s.getId());
		System.out.println(s.getMarks());
		System.out.println(s.getName());
		
	}
}