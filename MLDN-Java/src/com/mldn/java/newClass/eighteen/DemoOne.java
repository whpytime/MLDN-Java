package com.mldn.java.newClass.eighteen;

public class DemoOne {
	public static void main(String[] args) {
		Person1 per1 = new Person1("张三", 20);
		Person1 per2 = new Person1("李四", 30);
		Person1 per3 = new Person1("王五", 40);
		System.out.println(per1.getInfo());
		System.out.println(per2.getInfo());
		System.out.println(per3.getInfo());
	}
}

class Person1{
	private String name;
	private int age;
	String city = "北京";
	
	public Person1(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getInfo(){
		return "姓名：" + this.name + "，年龄：" + this.age + "，城市：" + this.city;
	}
}