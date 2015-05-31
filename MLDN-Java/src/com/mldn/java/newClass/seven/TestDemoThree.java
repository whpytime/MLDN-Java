package com.mldn.java.newClass.seven;

public class TestDemoThree {

	public static void main(String[] args) {
		Person3 per1 = new Person3("张三");
		Person3 per2 = new Person3("李四", 30);
		Person3 per3 = new Person3();
		per1.tell();
		per2.tell();
		per3.tell();
	}
}

class Person3 {
	private String name;
	private int age;

	public Person3() {
		this(null, 0);
	}

	public Person3(String name) {
		this(name, 0);
	}

	public Person3(String name, int age) {
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
		System.out.println("姓名：" + this.name + "，年龄：" + this.age);
	}
}
