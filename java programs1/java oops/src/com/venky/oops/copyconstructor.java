package com.venky.oops;

public class copyconstructor {
	String name;
	copyconstructor(String name){
		this.name=name;
	}
	copyconstructor(copyconstructor c){
		this.name=c.name;
	}
   /* copyconstructor m1(copyconstructor c5) {
    	this.name=c5.name;
    	return null;
    }*/
    void show() {
    	System.out.println("name="+name);
    }
    public static void main(String args[]) {
    	copyconstructor c1 = new copyconstructor("venky");
    	c1.show();
    	copyconstructor c2 = new copyconstructor(c1);
    	c2.show();

    	
    }
}
