package com.linkedlist;

public class LL {
    private Node head;
    private Node tail;
   private int size;
    
    public void add(int value) {
      Node n1 = new Node(value);
       n1.next=head;
       head=n1;
       if(tail==null) {  
    	tail=head;
    	 
       } 
       size++; 	
    }
    public void display() {
    	Node temp = head;
    	while(temp!=null) {
    		System.out.print(temp.value+"->");
    	   temp=temp.next;
    	}
    	System.out.println("end");
    	
    }
   public int size() {
    	return size;
    }
}
