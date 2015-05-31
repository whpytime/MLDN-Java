package com.mldn.java.newClass.seventeen;

public class DemoOne {
	public static void main(String[] args) {
		Person1 per1 = new Person1("����", 20);
		Person1 per2 = new Person1("����", 20);
		if (per1.getName().equals(per2.getName())
				&& per1.getAge() == per2.getAge()) {
			System.out.println("���");
		} else {
			System.out.println("�����");
		}
		System.out.println(per1.equals(per2));
	}
}

class Person1 {
	private String name;
	private int age;

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getInfo() {
		return "������" + this.name + "�����䣺" + this.age;
	}
}
