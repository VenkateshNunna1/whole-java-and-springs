package com.venky.upcasting;
  class car11{
	void start() {}
	void accelerate() {}
	void stop() {}

}
 class audi1 extends car11{
	void start(){
		System.out.println("audi startes");
	}
	void accelerate() {
		System.out.println("audi accelerate");
	}
	void stop() {
		System.out.println("audi stooped");
	}
}
 class benz1 extends car11{
	void start(){
		System.out.println("benz startes");
	}
	void accelerate() {
		System.out.println("benz accelerate");
	}
	void stop() {
		System.out.println("benz stooped");
	}
}
class alto1 extends car11{
	void start(){
		System.out.println("alto startes");
	}
	void accelerate() {
		System.out.println("alto accelerate");
	}
	void stop() {
		System.out.println("alto stooped");
	}
}
 class driver{
	void drive(car11 c) {
		c.accelerate();
		c.start();
		c.stop();
	}
}

public class car2 {

	public static void main(String[] args) {
		driver d = new driver();
	   car11 c = new audi1();
	    d.drive(c);
	    car11 c1 = new benz1();
	    d.drive(c1);
	    //car c2 = new alto();
	    d.drive(new alto1());

	}

}
