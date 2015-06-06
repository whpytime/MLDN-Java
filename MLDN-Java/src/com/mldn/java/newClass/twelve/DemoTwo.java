package com.mldn.java.newClass.twelve;

public class DemoTwo {
	public static void main(String[] args) {
		new Outer2().fun();
	}
}

class Outer2 {
	private String name = "Hello World .";

	public void fun() {
		new Inner2(this).print();
	}

	public String getName() {
		return this.name;
	}
}

class Inner2 {
	private Outer2 out = null;

	public Inner2(Outer2 out) {
		this.out = out;
	}

	public void print() {
		System.out.println(this.out.getName());
	}
}