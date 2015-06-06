package com.mldn.java.newClass.eighteen;

public class DemoFour {
	public static void main(String[] args) {
		System.out.println(Person4.city);// 还没有实例化对象产生
		Person4.city = "大连";
		System.out.println(Person4.city);
		Person4 per1 = new Person4("张三", 20);
		Person4 per2 = new Person4("李四", 30);
		Person4 per3 = new Person4("王五", 40);
		System.out.println(per1.getInfo());
		System.out.println(per2.getInfo());
		System.out.println(per3.getInfo());
		System.out.println("============");
		Person4.city = "上海";
		System.out.println(per1.getInfo());
		System.out.println(per2.getInfo());
		System.out.println(per3.getInfo());
	}
}

class Person4 {
	private String name;
	private int age;
	static String city = "北京";

	public Person4(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getInfo() {
		return "姓名：" + this.name + "，年龄：" + this.age + "，城市：" + this.city;
	}
}