package com.mldn.java.newClass.eighteen;

public class DemoFive {
	public static void main(String[] args) {
		System.out.println(Person5.getCity());
		Person5.setCity("���");
		Person5 per = new Person5("����", 20);
		System.out.println(per.getInfo());
	}
}

class Person5 {
	private String name;
	private int age;
	private static String city = "����";

	public Person5(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void setCity(String cy) {
		city = cy;// ����ʹ��this.city
	}

	public static String getCity() {
		return city;// ����ʹ��this.city
	}

	public String getInfo() {
		return "������" + this.name + "�����䣺" + this.age + "�����У�" + city;
	}
}