package com.mldn.java.newClass.five;

public class TestDemoOne {

	public static void main(String[] args) {
		Person per;
		per = new Person();
		per.name = "����";
		per.age = 20;
		per.tell();
	}

}

class Person {
	String name;
	int age;

	public void tell() {
		System.out.println("������" + this.name + "�����䣺" + this.age);
	}
}