package com.venky.abstract1;
 abstract class mobile{
	abstract void sim();
	abstract void charger();
	abstract void battery();
	abstract void display();
}
 class buttonphone extends mobile {

	@Override
	void sim() {
		System.out.println(this.getClass().getSimpleName()+"need sim");
		
	}

	@Override
	void charger() {
		System.out.println(this.getClass().getSimpleName()+"need charger");
	}

	@Override
	void battery() {
		System.out.println(this.getClass().getSimpleName()+"need battery");
		
	}

	@Override
	void display() {
		System.out.println(this.getClass().getSimpleName()+"need display");		
	}
	 
 }
 class smartphone extends mobile{
	 @Override
		void sim() {
			System.out.println(this.getClass().getSimpleName()+"need sim");
			
		}

		@Override
		void charger() {
			System.out.println(this.getClass().getSimpleName()+"need charger");
		}

		@Override
		void battery() {
			System.out.println(this.getClass().getSimpleName()+"need battery");
			
		}

		@Override
		void display() {
			System.out.println(this.getClass().getSimpleName()+"need display");		
		}
 }
 class human{
	 void use(mobile m) {
		 m.battery();
		 m.charger();
		 m.display();
		 m.sim();
	 }
 }

public class cellphone {

	public static void main(String[] args) {
		human h = new human();
		mobile m = new buttonphone();
		h.use(m);
		mobile m1 = new smartphone();
		m1.battery();
		m1.charger();
		m1.display();
		m1.sim();
		
	}
	

}
