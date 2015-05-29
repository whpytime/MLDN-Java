package com.mldn.java.newClass.six;

public class TestDemoOne {

	public static void main(String[] args) {
		Person per = new Person();
		per.name = "张三";// 报错
		per.age = -30;// 报错
		per.tell();
	}
}

class Person {
	String name;
	int age;

	public void tell() {
		System.out.println("姓名：" + name + "，年龄：" + age);
	}
}