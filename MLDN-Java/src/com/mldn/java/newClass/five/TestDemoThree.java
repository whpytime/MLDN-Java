package com.mldn.java.newClass.five;

public class TestDemoThree {
	public static void main(String args[]) {
		Person3 per1 = new Person3();
		Person3 per2 = null;
		per1.name = "����";
		per1.age = 30;
		per2 = per1;
		per2.name = "����";
		per2.age = 20;
		per1.tell();
	}
}

class Person3 {
	String name;
	int age;

	public void tell() {
		System.out.println("������" + name + "�����䣺" + age);
	}
}
