package com.mldn.java.newClass.eight;

public class TestJava {

	public static void main(String[] args) {
		new Person("张三", 20).tell();
	}
}

class Person {
	String name;
	int age;

	public Person() {
		this(null, 0);
	}

	public Person(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0 && age <= 250) {
			this.age = age;
		}
	}

	public void tell() {
		System.out.println("姓名：" + this.getName() + "，年龄：" + this.getAge());
	}
}