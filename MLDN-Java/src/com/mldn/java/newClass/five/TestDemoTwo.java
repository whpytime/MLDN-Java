package com.mldn.java.newClass.five;

public class TestDemoTwo {
	public static void main(String args[]) {
		Person2 per1 = new Person2();
		Person2 per2 = new Person2();
		per1.name = "����";
		per1.age = 30;
		per2.name = "����";
		per2.age = 20;
		per1.tell();
	}
}

class Person2 {
	String name;
	int age;

	public void tell() {
		System.out.println("������" + name + "�����䣺" + age);
	}
}