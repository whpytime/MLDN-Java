package com.mldn.java.newClass.eighteen;

public class DemoSeven {
	public static void main(String[] args) {
		System.out.println(new Person7().getName());
		System.out.println(new Person7("张三").getName());
		System.out.println(new Person7().getName());
		System.out.println(new Person7().getName());
	}
}

class Person7 {
	private String name;
	private static int count = 0;

	public Person7() {
		this("无名氏 - " + ++count);
	}

	public Person7(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}