package com.mldn.java.newClass.eighteen;

public class DemoThree {
	public static void main(String[] args){
		Person3 per1 = new Person3("张三", 20);
		Person3 per2 = new Person3("李四", 30);
		Person3 per3 = new Person3("王五", 40);
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

class Person3{
	private String name;
	private int age;
	static String city = "北京";
	
	public Person3(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getInfo(){
		return "姓名：" + this.name + "，年龄：" + this.age + "，城市：" + this.city;
	}
}