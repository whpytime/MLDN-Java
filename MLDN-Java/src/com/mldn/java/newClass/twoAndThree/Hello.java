package com.mldn.java.newClass.twoAndThree;

public class Hello{
	public static void main(String args[])	{
		A a = new A();
		B b = new B();

		System.out.println("Hello,world!");
	}
}

class A{
	A()	{
		System.out.println("A");
	}
}

class B{
	B()	{
		System.out.println("B");
	}
}