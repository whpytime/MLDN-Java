package com.mldn.java.newClass.eighteen;

public class DemoFour {
	public static void main(String[] args) {
		System.out.println(Person4.city);// ��û��ʵ�����������
		Person4.city = "����";
		System.out.println(Person4.city);
		Person4 per1 = new Person4("����", 20);
		Person4 per2 = new Person4("����", 30);
		Person4 per3 = new Person4("����", 40);
		System.out.println(per1.getInfo());
		System.out.println(per2.getInfo());
		System.out.println(per3.getInfo());
		System.out.println("============");
		Person4.city = "�Ϻ�";
		System.out.println(per1.getInfo());
		System.out.println(per2.getInfo());
		System.out.println(per3.getInfo());
	}
}

class Person4 {
	private String name;
	private int age;
	static String city = "����";

	public Person4(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getInfo() {
		return "������" + this.name + "�����䣺" + this.age + "�����У�" + this.city;
	}
}