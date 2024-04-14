package com.venky.interface1;
interface mobile{
	void camera();
	void fingerprint();
	void display();
	void charger();
    void darkmode();
    default void indisplayfingerprint() {//default method in interface
    	System.out.println("indisplay fingerprint");
    }
    static void warranty() {//static method in interface
    	System.out.println("warranty atleast 2 years");
    }
}
class oppo implements mobile{

	@Override
	public void camera() {
		System.out.println(this.getClass().getSimpleName()+" mobile camera has mandatory");
		
	}

	@Override
	public void fingerprint() {
		System.out.println(this.getClass().getSimpleName()+" mobile fingerprint has mandatory");
		
	}

	@Override
	public void display() {
		System.out.println(this.getClass().getSimpleName()+" mobile display has mandatory");
	}

	@Override
	public void charger() {
		System.out.println(this.getClass().getSimpleName()+" mobile charger has mandatory");
	}

	@Override
	public void darkmode() {
		System.out.println(this.getClass().getSimpleName()+" mobile darkmode has mandatory");
	}
	
}
class apple implements mobile{
	@Override
	public void camera() {
		System.out.println(this.getClass().getSimpleName()+" mobile camera has mandatory");
		
	}

	@Override
	public void fingerprint() {
		System.out.println(this.getClass().getSimpleName()+" mobile fingerprint has mandatory");
		
	}

	@Override
	public void display() {
		System.out.println(this.getClass().getSimpleName()+" mobile display has mandatory");
	}

	@Override
	public void charger() {
		System.out.println(this.getClass().getSimpleName()+" mobile charger has mandatory");
	}

	@Override
	public void darkmode() {
		System.out.println(this.getClass().getSimpleName()+" mobile darkmode has mandatory");
	}
	public void indisplayfingerprint() {
		System.out.println(this.getClass().getSimpleName()+ " uses faceid");
	}
	
}
class design{
	static void design() {
		System.out.println("**************************************************************");
	}
}

public class test1 {

	public static void main(String[] args) {
		mobile m = new oppo();
		m.camera();
		m.charger();
		m.darkmode();
		m.display();
		m.fingerprint();
		design.design();
		mobile m1 = new apple();
		m1.camera();
		m1.charger();
		m1.darkmode();
		m1.display();
	   m1.fingerprint();
	   mobile.warranty();
	   design.design();

	}

}
