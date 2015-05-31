package com.mldn.java.newClass.thirteen;

public class thisDemo {

	public static void main(String[] args) {
		Person per1 = new Person();
		System.out.println("1---------------");
		Person per2 = new Person("张三");
		System.out.println("2---------------");
		Person per3 = new Person("李四", 20);
	}
}

class Person{
	private String name;
	private int age;
	
	public Person(){
		System.out.println("1、无参构造");
	}
	
	public Person(String name){
		this();
		this.name = name;
		System.out.println("2、一个参数构造");
	}
	
	public Person(String name, int age){
		this(name);
		this.age = age;
		System.out.println("3、两个参数构造");
	}
}