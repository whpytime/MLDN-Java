package com.mldn.java.newClass.five;

public class TestDemoTwo {
	public static void main(String args[]) {
		Person2 per1 = new Person2();
		Person2 per2 = new Person2();
		per1.name = "张三";
		per1.age = 30;
		per2.name = "李四";
		per2.age = 20;
		per1.tell();
	}
}

class Person2 {
	String name;
	int age;

	public void tell() {
		System.out.println("姓名：" + name + "，年龄：" + age);
	}
}