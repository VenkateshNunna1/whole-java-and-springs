package com.venky.upcasting;
class car1{
	void start() {}
	void accelerate(){}
	void brake(){}
}
class Audi extends car1{
	void start() {
		System.out.println("Audi car started");
	}
	void accelerate(){
		System.out.println("Audi car accelerated");
	}
	void brake(){
		System.out.println("audi car stoped");
}
}
	class benz extends car1{
		void start() {
			System.out.println("Benz car started");
		}
		void accelerate(){
			System.out.println("Benz car accelerated");
		}
		void brake(){
			System.out.println("Benz car stoped");

	}
	}
		class alto extends car1{
			void start() {
				System.out.println("alto car started");
			}
			void accelerate(){
				System.out.println("alto car accelerated");
			}
			void brake(){
				System.out.println("alto car stoped");

		}

		}
class Driver{		
	void drive(car1 c) {
	 c.start();
	 c.accelerate();
	 c.brake();
	}
	void design() {
		System.out.println("***************************************************************");
	}
}
public class car {

	public static void main(String[] args) {
		Driver d = new Driver();
		 car1 c1 = new Audi();
		 d.drive(c1);
		 d.design();
		 car1 c2 = new benz();
		 d.drive(c2);
		 d.design();
		 car1 c3 = new alto();
		 d.drive(c3);
		 d.design();
		

	}

}
	
