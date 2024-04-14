package com.venky.oops;

public class constructorchaining {
	constructorchaining(){
		this(10);
		System.out.println("0 arguments");
	}
	constructorchaining(int a){
	  this(10,20);
		System.out.println("1 argument");
	}
	constructorchaining(int a,int b){
		
		System.out.println("2 argument");
	}
	public static void main(String args[]) {
		constructorchaining c = new constructorchaining();
	}
}
