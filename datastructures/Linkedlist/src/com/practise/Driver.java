package com.practise;

public class Driver {

	public static void main(String[] args) {
		LL ll = new LL();
		ll.add(1);
		ll.add(45);
		ll.insertAtLast(13);
		int s=ll.size();
		System.out.println(s);
		ll.display();
		

	}

}
