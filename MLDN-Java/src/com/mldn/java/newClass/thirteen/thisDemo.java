package com.mldn.java.newClass.thirteen;

public class thisDemo {

	public static void main(String[] args) {
		Person per1 = new Person();
		System.out.println("1---------------");
		Person per2 = new Person("����");
		System.out.println("2---------------");
		Person per3 = new Person("����", 20);
	}
}

class Person{
	private String name;
	private int age;
	
	public Person(){
		System.out.println("1���޲ι���");
	}
	
	public Person(String name){
		this();
		this.name = name;
		System.out.println("2��һ����������");
	}
	
	public Person(String name, int age){
		this(name);
		this.age = age;
		System.out.println("3��������������");
	}
}