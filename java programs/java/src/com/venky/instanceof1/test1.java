package com.venky.instanceof1;
abstract class car{
	
}
class Audi extends car{
	void bluetooth() {
		System.out.println("the functionality of bluetooth in audi is bluetooth5");
	}
}
class alto extends car{
	void bluetooth() {
		System.out.println("the functionality of bluetooth in alto is bluettoth version 1");
	}
}
class driver{
	void drive(car b) {
		if(b instanceof Audi) {
			Audi a = (Audi) b;
			a.bluetooth();
		}
		if(b instanceof alto) {
			alto a1 =(alto)b;
			a1.bluetooth();
		}
		
	}
}
public class test1 {

	public static void main(String[] args) {
		driver d = new driver();
		d.drive(new Audi());
		car c1 = new alto();
		d.drive(c1);
		
	}

}
