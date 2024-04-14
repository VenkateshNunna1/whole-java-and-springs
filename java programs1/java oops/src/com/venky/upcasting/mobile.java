package com.venky.upcasting;
class phone{
	String sim;
	
	void m1() {
		System.out.println("phone class");
	}
	void m3() {
		System.out.println("new phone");
	}
}
class buttonphone extends phone{
	String camera;
	@Override
	void m1() {
		System.out.println("button phone");
	}
	void m2() {
		
	}
}
class smartphone extends buttonphone{
	String android;
	@Override
	void m1() {
		System.out.println("smart phone");
	}
	void m5() {
		
	}
}
public class mobile {

	public static void main(String[] args) {
		phone p = new smartphone();
		p.m1();
		System.out.println(p.sim);
	    p.m3();
	    buttonphone b = new smartphone();
	    b.m1();
	    System.out.println(b.sim);
	    b.m3();
	    b.m1();
	    b.m2();
	    
	   
	   
	   
	    

	}

}
