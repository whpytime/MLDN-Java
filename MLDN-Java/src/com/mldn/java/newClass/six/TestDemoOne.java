package com.mldn.java.newClass.six;

public class TestDemoOne {

	public static void main(String[] args) {
		Person per = new Person();
		per.name = "����";// ����
		per.age = -30;// ����
		per.tell();
	}
}

class Person {
	String name;
	int age;

	public void tell() {
		System.out.println("������" + name + "�����䣺" + age);
	}
}