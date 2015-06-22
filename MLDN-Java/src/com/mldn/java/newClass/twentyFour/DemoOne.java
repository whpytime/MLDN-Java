package com.mldn.java.newClass.twentyFour;

public class DemoOne {
	public static void main(String[] args) {
		Student1 stu = new Student1();
		stu.setName("小金子");
		stu.setAge(20);
		stu.setSchool("哈工大");
		System.out.println(stu.getName() + "，" + stu.getAge() + "，" + stu.getSchool());
	}
}

class Person1 {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}
}

class Student1 extends Person1 {
	private String school;

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSchool() {
		return this.school;
	}
}