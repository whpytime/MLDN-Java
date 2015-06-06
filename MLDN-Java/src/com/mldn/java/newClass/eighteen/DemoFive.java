package com.mldn.java.newClass.eighteen;

public class DemoFive {
	public static void main(String[] args) {
		System.out.println(Person5.getCity());
		Person5.setCity("天津");
		Person5 per = new Person5("张三", 20);
		System.out.println(per.getInfo());
	}
}

class Person5 {
	private String name;
	private int age;
	private static String city = "北京";

	public Person5(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void setCity(String cy) {
		city = cy;// 不能使用this.city
	}

	public static String getCity() {
		return city;// 不能使用this.city
	}

	public String getInfo() {
		return "姓名：" + this.name + "，年龄：" + this.age + "，城市：" + city;
	}
}