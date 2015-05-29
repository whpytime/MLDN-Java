package com.mldn.java.newClass.five;

public class TestDemoSix {
	public static void main(String args[]) {
		Person6 per1 = new Person6();
		Person6 per2 = new Person6();
		per1.name = "张三";
		per1.age = 30;
		per2.name = "李四";
		per2.age = 20;
		per2 = per1;
		per2.name = "王五";
		per1.tell();
		per2.tell();
	}
}

class Person6 {
	String name;
	int age;

	public void tell() {
		System.out.println("姓名：" + name + "，年龄：" + age);
	}
}