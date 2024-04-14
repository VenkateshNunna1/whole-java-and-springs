package com.venky.upcasting;
class vegetable{
	
}
class onion extends vegetable{
	
}
class tomato extends vegetable{
	
}
class radish extends vegetable{
	
}
class shopkeeper{
  vegetable sell(vegetable v) {
		return v;
	}
}
public class veg {

	public static void main(String[] args) {
		shopkeeper s = new shopkeeper();
		vegetable v = new onion();
        vegetable v2 = s.sell(v);


	}

}
