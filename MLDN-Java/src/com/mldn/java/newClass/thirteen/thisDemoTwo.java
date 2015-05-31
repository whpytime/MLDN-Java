package com.mldn.java.newClass.thirteen;

public class thisDemoTwo {

	public static void main(String[] args) {
		Person1 per1 = new Person1();
		Person1 per2 = new Person1();
		System.out.println("mai = " + per1);
		per1.print();
		System.out.println("main = " + per2);
		per2.print();
	}
}

class Person1{
	public void print(){
		System.out.println("Person this = " + this);
	}
}