package com.mldn.java.newClass.ten;

public class ArrayTestNine {

	public static void main(String[] args) {
		Person1[] per = new Person1[3];
		per[0] = new Person1("张三", 20);
		per[1] = new Person1("李四", 30);
		per[2] = new Person1("王五", 30);
		print(per);
	}
	
	public static void print(Person1[] per){
		for(int i = 0; i < per.length; i++){
			System.out.println(per[i].getInfo());
		}
	}
}

class Person1{
	private String name;
	private int age;
	
	public Person1(){
		this(null, 0);
	}
	
	public Person1(String name, int age){
		this.setName(name);
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age >= 0 && age <= 250){
			this.age = age;
		}
	}
	
	public String getInfo(){
		return "姓名：" + this.getName() + "，年龄：" + this.getAge();
	}
}
