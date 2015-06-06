package com.mldn.java.newClass.eighteen;

public class DemoEight {
	public static void main(String[] args) {
		System.out.println(new Person8("张三").getName());
		System.out.println(Person8.getInstance().getName());
	}
}

class Person8 {
	private String name;

	public Person8(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public static Person8 getInstance() {
		return new Person8("默认姓名");
	}
}