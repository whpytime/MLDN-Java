package com.mldn.java.newClass.eighteen;

public class DemoThree {
	public static void main(String[] args){
		Person3 per1 = new Person3("����", 20);
		Person3 per2 = new Person3("����", 30);
		Person3 per3 = new Person3("����", 40);
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

class Person3{
	private String name;
	private int age;
	static String city = "����";
	
	public Person3(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getInfo(){
		return "������" + this.name + "�����䣺" + this.age + "�����У�" + this.city;
	}
}