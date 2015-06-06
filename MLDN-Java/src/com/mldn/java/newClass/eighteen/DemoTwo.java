package com.mldn.java.newClass.eighteen;

public class DemoTwo {
	public static void main(String[] args) {
		Person2 per1 = new Person2("张三", 20);
		Person2 per2 = new Person2("李四", 30);
		Person2 per3 = new Person2("王五", 40);
		System.out.println(per1.getInfo());
		System.out.println(per2.getInfo());
		System.out.println(per3.getInfo());
		System.out.println("============");
		per1.city = "上海";
		System.out.println(per1.getInfo());
		System.out.println(per2.getInfo());
		System.out.println(per3.getInfo());
	}
}

class Person2{
	private String name;
	private int age;
	String city = "北京";
	
	public Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getInfo(){
		return "姓名：" + this.name + "，年龄：" + this.age + "，城市：" + this.city;
	}
}