package com.venky.interface1;
interface washable{//marker interface
	
}
class car1 implements washable{
	
}
class truck implements washable{
	
}
class tv {
	
}
class mobile1{
	
}
class washerman{
	void wash(washable w) {
		if(w instanceof washable)
		     System.out.println(w.getClass().getSimpleName()+" is washable");
		else {
			System.out.println(w.getClass().getSimpleName()+" is not washable");
		}
			
	}
	
}
public class test2 {

	public static void main(String[] args) {
		washerman w1 = new washerman();
		washable w = new car1();
		w1.wash(w);
		washable w2 = new truck();
		w1.wash(w2);
			

	}

}
