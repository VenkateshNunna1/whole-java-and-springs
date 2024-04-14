package com.venky.abstract1;
 abstract class car{
	 abstract void start();
	 abstract void accelerate();
	 abstract void stop();
	 
 }
  class audi extends car{
	 void start() {
			System.out.println("Audi car started");
		}
		void accelerate(){
			System.out.println("Audi car accelerated");
		}
		void stop(){
		  System.out.println("audi car stoped");
         }

 }
  class benz extends car{
	  void start() {
			System.out.println("Benz car started");
		}
		void accelerate(){
			System.out.println("Benz car accelerated");
		}
		void stop(){
			System.out.println("Benz car stoped");
		}
  }
  class driver{
	 car drive(car c ) {
		 c.start();
		 c.accelerate();
		 c.stop();
		  return c;
	  }
  }
public class test {

	public static void main(String[] args) {
		driver d = new driver();
	   car c1 = new audi();
	   d.drive(c1);
	   car c2= new benz();
	   d.drive(c2);
	   
	}

}
