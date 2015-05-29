package com.mldn.java.newClass.five;

public class TestDemoOne {

	public static void main(String[] args) {
		Person per;
		per = new Person();
		per.name = "张三";
		per.age = 20;
		per.tell();
	}

}

class Person {
	String name;
	int age;

	public void tell() {
		System.out.println("姓名：" + this.name + "，年龄：" + this.age);
	}
}