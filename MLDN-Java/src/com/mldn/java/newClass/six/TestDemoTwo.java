package com.mldn.java.newClass.six;

public class TestDemoTwo {

	public static void main(String[] args) {
		Person2 per = new Person2();
		per.setName("张三");
		per.setAge(-30); // 业务错误
		per.tell();
	}
}

class Person2 {
	private String name;
	private int age;

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
		System.out.println("姓名：" + name + "，年龄：" + age);
	}
}