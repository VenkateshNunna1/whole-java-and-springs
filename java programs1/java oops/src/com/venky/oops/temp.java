package com.venky.oops;

public class temp {
   int temp;
	public temp() {
		this.temp=21;
	}
	temp(int t){ 
		this.temp=t;
	}
	void showtemp() {
		System.out.println("the temperature of room iS:"+temp);
	}

	public static void main(String[] args) {
		temp t1 = new temp();
		t1.showtemp();
		temp t2 = new temp(34);
		t2.showtemp();

	}

}
