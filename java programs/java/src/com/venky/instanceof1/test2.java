package com.venky.instanceof1;
@FunctionalInterface
interface vegetable{//functional interface atmost one abstract method
	void wash();
}
class tomato implements vegetable{

	@Override
	public void wash() {
		System.out.println(this.getClass().getSimpleName()+"should be wash with luke water");		
	}
	
}
class potato implements vegetable{
	public void wash() {
		System.out.println(this.getClass().getSimpleName()+"should be wash with luke water");	
	}
}
class design{
	static void design() {
		System.out.println("************************************************");
	}
}
class human {
	void wash(vegetable v1) {
		if(v1 instanceof tomato) {
			v1.wash();
			design.design();
		}
		if(v1 instanceof potato) {
			v1.wash();
			design.design();
		}
		if(v1 instanceof vegetable) {
			v1.wash();
			design.design();
		}
		
	}
}
public class test2 {
public static void main(String args[]) {
	human h = new human();
	vegetable v = new tomato();
	h.wash(v);
	vegetable v1 = new potato();
	h.wash(v1);
}
}
