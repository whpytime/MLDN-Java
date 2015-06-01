package com.mldn.java.newClass.seventeen;

public class DemoOne {
	public static void main(String[] args) {
		Person1 per1 = new Person1("张三", 20);
		Person1 per2 = new Person1("张三", 20);
		if (per1.getName().equals(per2.getName())
				&& per1.getAge() == per2.getAge()) {
			System.out.println("相等");
		} else {
			System.out.println("不相等");
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
		return "姓名：" + this.name + "，年龄：" + this.age;
	}
}
