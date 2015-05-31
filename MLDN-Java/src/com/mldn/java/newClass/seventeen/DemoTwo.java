package com.mldn.java.newClass.seventeen;

public class DemoTwo {
	public static void main(String[] args) {
		Person2 per1 = new Person2("����", 20);
		Person2 per2 = new Person2("����", 20);
		if (per1.compare(per2)) {
			System.out.println("���");
		} else {
			System.out.println("�����");
		}
	}
}

class Person2 {
	private String name;
	private int age;

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}
	
	public boolean compare(Person2 per){
		if(this == per){
			return true;
		}
		if(per == null){
			return false;
		}
		if(this.name.equals(per.name) && this.age == per.age){
			return true;
		}
		return false;
	}

	public String getInfo() {
		return "������" + this.name + "�����䣺" + this.age;
	}
}