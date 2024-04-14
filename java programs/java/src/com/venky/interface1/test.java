package com.venky.interface1;
interface car{
	void start();
	void accelerate();
	void stop();
	void bluetooth();

}
class audi implements car{
	 public void start() {
		System.out.println(this.getClass().getSimpleName()+"car started");
	}

	@Override
	public void accelerate() {
		System.out.println(this.getClass().getSimpleName()+"car accelerated");
		
	}

	@Override
	public void stop() {
		System.out.println(this.getClass().getSimpleName()+"car stopped");
		
	}

	@Override
	public void bluetooth() {
		System.out.println(this.getClass().getSimpleName()+"car has bluetooth functionality");
		
	}
	void airbag() {
		System.out.println(this.getClass().getSimpleName()+"car has 8 air bags");
	}
	void fourwheeldrive() {
		System.out.println(this.getClass().getSimpleName()+"car has comes with 4wheel drive");
	}
}
class benz implements car{

	@Override
	public void start() {
		
		System.out.println(this.getClass().getSimpleName()+"car started");
	}

	@Override
	public void accelerate() {
		System.out.println(this.getClass().getSimpleName()+"car accelerated");

	}

	@Override
	public void stop() {
		System.out.println(this.getClass().getSimpleName()+"car stopped");
		
	}

	@Override
	public void bluetooth() {
		System.out.println(this.getClass().getSimpleName()+"car has bluetooth functionality");
		
	}
	void airbag() {
		System.out.println(this.getClass().getSimpleName()+"car has 16 air bags");
	}
	void ventilationseats() {
		System.out.println(this.getClass().getSimpleName()+"car has 4 ventilation seats");
	}
	void wirelesscharger() {
		System.out.println(this.getClass().getSimpleName()+"car has 18w wireless charger");
	}
	static void  design() {
		System.out.println("*****************************************************");
	}
}
public class test {

	public static void main(String[] args) {
		car c = new audi();//upcasting //sub type to super type
		c.accelerate();
		c.bluetooth();
		c.start();
		c.stop();
		audi a = (audi)c;//downcasting //super type to sub type //subclassname reference = (subclassname) superclassreference
		a.airbag();
		a.fourwheeldrive();
		benz.design();
		car c1 = new benz();
		c1.accelerate();
		c1.bluetooth();
		c1.start();
		c1.stop();
		benz b =(benz)c1;
		b.airbag();
		b.ventilationseats();
		b.wirelesscharger();
		benz.design();
		

	}

}
