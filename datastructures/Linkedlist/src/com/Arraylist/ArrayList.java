package com.Arraylist;

public class ArrayList {
 private Object[] arr;
 private int p;
 public ArrayList() {
	 arr= new Object[5];
	 p=0;
 }
 public void add(Object e) {
	 if(p>=arr.length) {
		 increaseSize();
	 }
	 arr[p++]=e;
 }
 public void increaseSize() {
	 Object[] newarr = new Object[arr.length+3];
	 for(int i=0;i<=arr.length-1;i++) {
		 newarr[i]=arr[i];
	 }
	 arr=newarr;
 }
 public void add(int index,Object e) {
	 if(index<=-1 || index>=size()) {
		 throw new IndexOutOfBoundsException();
	 }
	 if(p>=arr.length) {
		 increaseSize();
	 }
	 for(int i=size()-1;i>=index;i--) {
		 arr[i+1]=arr[i];
	 }
	 arr[index]=e;
	 p++;
 }
 public int size() {
	 return p;
 }
 public Object get(int index) {
	 if(index<=-1 || index>=size()) {
		 throw new IndexOutOfBoundsException();
	 }
	 return arr[index];
 }
 public void remove(int index) {
	 if(index<=-1 || index>=size()) {
		 throw new IndexOutOfBoundsException();
	 }
	 for(int i=index+1;i<=size();i++) {
		 arr[i-1]=arr[i];
	 }
	 p--;
	 arr[p]=null;
 }
}
