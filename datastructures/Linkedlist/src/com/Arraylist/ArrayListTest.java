package com.Arraylist;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(1);
		arr.add(3);
		arr.add(1, 89);
		arr.remove(1);
		int s=arr.size();
		System.out.println(s);
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
	}

}
