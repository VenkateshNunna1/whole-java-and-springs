package com.venky.oops;

public class p {
   int i;
   void m1(int i) {
	   this.i=i;
   }
   void m2(p p3) {
	   i=p3.i;
   }
   void show() {
	   System.out.println("value of i:"+i);
   }
   public static void main(String args[]) {
	   p p1 = new p();
	   p1.m1(109);
	   p1.show();
	   p p2 = new p();
	   p2.m2(p1);
	   p2.show();
   }
}
