package com.mldn.java.newClass.five;

public class TestDemoSix {
	public static void main(String args[]) {
		Person6 per1 = new Person6();
		Person6 per2 = new Person6();
		per1.name = "����";
		per1.age = 30;
		per2.name = "����";
		per2.age = 20;
		per2 = per1;
		per2.name = "����";
		per1.tell();
		per2.tell();
	}
}

class Person6 {
	String name;
	int age;

	public void tell() {
		System.out.println("������" + name + "�����䣺" + age);
	}
}