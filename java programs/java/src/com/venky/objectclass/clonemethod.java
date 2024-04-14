package com.venky.objectclass;

public class clonemethod implements Cloneable {
     int i;
     int j;
     void m1() {
    	 System.out.println(i+""+j);
     }
	public static void main(String[] args) throws CloneNotSupportedException  {
		clonemethod a = new clonemethod();
          clonemethod a1 =  (clonemethod) a.clone();
		System.out.println(a==a1);

	}

}
