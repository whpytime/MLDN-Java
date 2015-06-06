package com.mldn.java.newClass.twenty;

public class DemoOne {
	public static void main(String[] args) {
		new Outer().fun();
	}
}

class Outer {
	private String msg = "Hello World .";

	class Inner {
		public void print() {
			System.out.println(msg);
		}
	}

	public void fun() {
		new Inner().print();
	}
}