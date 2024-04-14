package com.practise;

public class LL {
   private Node head;
   private Node tail;
   public int size;
   public void add(int val) {
	   Node n1 = new Node(val);
	    n1.next=head;
     	head=n1;
	    if(tail==null) {
	    	tail=head;
	    	
	    }
	    size++;
	   
   }
   public void display() {
	   Node temp =head;
	   while(temp!=null) {
		   System.out.print(temp.val+"->");
		   temp=temp.next;
	   }
   }
   public int size() {
	   return size;
   }
   public void insertAtLast(int val) {
	   if(tail==null) {
		   add(val);
		   return;
	   }
	   Node n = new Node(val);
	   tail.next=n;
	   tail=n;
	   size++;
   }
  
}
