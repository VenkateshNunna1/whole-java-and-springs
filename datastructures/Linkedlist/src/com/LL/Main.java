package com.LL;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LL l = new LL();
		l.insertFirst(20);
		l.insertFirst(40);
		l.insertFirst(89);
		l.insertLast(70);
		l.insert(100,2);
		l.display();
		System.out.println();
		System.out.println(l.size());
	
	}

}
