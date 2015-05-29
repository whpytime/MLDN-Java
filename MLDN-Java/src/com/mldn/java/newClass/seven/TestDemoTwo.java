package com.mldn.java.newClass.seven;

public class TestDemoTwo {

	public static void main(String[] args) {
		Person2 per = new Person2("张三", 30);
		per.tell();
	}
}

class Person2 {
	private String name;
	private int age;

	public Person2(String name, int age) {
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
