package com.venky.singleton;
import java.util.Scanner;
class theatre{
	int seats=50;
	private static theatre t=null;
	private theatre() {
		
	}
	public static theatre t1() {   //factory method -helper method
		      if(t==null)t= new theatre();
		return t;
	}
	public void reserveseats(int numseats) {
		if(numseats>seats) {
			System.out.println(numseats+"seats are not available");
			System.out.println(seats +"seats are  a available");
		}
		else {
		seats=seats-numseats;
		System.out.println(numseats+"seats reserved");
		System.out.println(seats+"seats are available");
		}
	}
	
}
class bookingapp{
	public void booktickets() {
		Scanner scan = new Scanner(System.in);
		int tickets = scan.nextInt();
		theatre theatre1 = theatre.t1();
		theatre1.reserveseats(tickets);
		
		
	}
}

public class bookmyshow {

	public static void main(String[] args) {
		bookingapp cust1 = new bookingapp();
		cust1.booktickets();
		bookingapp cust2 = new bookingapp();
		cust2.booktickets();
		

	}

}
