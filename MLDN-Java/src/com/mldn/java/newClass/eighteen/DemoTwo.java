package com.mldn.java.newClass.eighteen;

public class DemoTwo {
	public static void main(String[] args) {
		Person2 per1 = new Person2("����", 20);
		Person2 per2 = new Person2("����", 30);
		Person2 per3 = new Person2("����", 40);
		System.out.println(per1.getInfo());
		System.out.println(per2.getInfo());
		System.out.println(per3.getInfo());
		System.out.println("============");
		per1.city = "�Ϻ�";
		System.out.println(per1.getInfo());
		System.out.println(per2.getInfo());
		System.out.println(per3.getInfo());
	}
}

class Person2{
	private String name;
	private int age;
	String city = "����";
	
	public Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getInfo(){
		return "������" + this.name + "�����䣺" + this.age + "�����У�" + this.city;
	}
}