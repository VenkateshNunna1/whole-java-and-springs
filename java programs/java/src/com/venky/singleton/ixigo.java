package com.venky.singleton;
import java.util.Scanner;
class railway{
	int seats=250;
	private static railway r = null;
	private railway() {
		
	}
	public static railway r1() {
		if(r==null) {
			r= new railway();
		}
		return r;
	}
	public void reservetickets(int reservetickets) {
		if(reservetickets<=seats) {
			seats=seats-reservetickets;
			System.out.println(reservetickets+" are booked");
			System.out.println(seats+" are available");
		}
		else {
			System.out.println(reservetickets+"seats are not available");
			System.out.println(seats +"seats are  a available");
		}
	}
	
}
class ixigo_internal{
	Scanner in = new Scanner(System.in);
	void m1() {
      System.out.println("enter how many ticket customer want:");
      int tickets = in.nextInt();
       railway ry1    = railway.r1();
        ry1.reservetickets(tickets);
		
	}
	
}
class ixigo{
	public static void main(String args[]) {
		ixigo_internal cust1 = new ixigo_internal();
		cust1.m1();
		ixigo_internal cust2 = new ixigo_internal();
		cust2.m1();
	}
}