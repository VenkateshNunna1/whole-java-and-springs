package com.venky.upcasting;
class Animal{
	void eat() {
		
	}
	void drink() {
		
	}
	void walk() {
		
	}
	
}
class Lion extends Animal{
   void eat() {
		System.out.println("lion eats flesh");
	}
	void drink() {
		System.out.println("lion drinks blood");
	}
	void walk() {
		System.out.println("lion walks like king");
	}
	
}
class Dog extends Animal{
	void eat() {
		System.out.println("dogs eats flesh");
	}
	void drink() {
		System.out.println("dogs drinks water");
	}
	void walk() {
		System.out.println("dogs walks normally");
	}
}
class Human{
	
	Animal control() {
		Animal A;
		A = new Lion();
		A.drink();
        A.eat();
        A.walk();
        A = new Dog();
        A.drink();
        A.eat();
        A.walk();
		return A;
	}
}
public class test {

	public static void main(String[] args) {
		Human h = new Human();
		h.control();

	}

}
