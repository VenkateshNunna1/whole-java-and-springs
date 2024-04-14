package com.venky.method_overriding;
class whatsapp{
 void sent() {
		System.out.println("single tick");
	}
}
 class whatsapp1 extends whatsapp{
	  void sent() {
		System.out.println("double tick");
	}
}
 class whatsapp2 extends whatsapp1{
	 
	 void sent() {
		System.out.println("double tick with blue color");
	}
}
  class whatsapp3 extends whatsapp2{
	  void sent() {
		  System.out.println("triple tick");
	  }
  }
 class test {

	public static void main(String[] args) {
		whatsapp3 w = new whatsapp3();
		w.sent();
	}

}
