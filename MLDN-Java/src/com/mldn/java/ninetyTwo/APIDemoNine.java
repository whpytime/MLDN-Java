package com.mldn.java.ninetyTwo;

import java.lang.reflect.Constructor;

class Person3 {
	private String name;
	private int age;

	public Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "姓名：" + this.name + "，年龄：" + this.age;
	}
}

public class APIDemoNine {

	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("com.mldn.java.ninetyTwo.Person3");
		Constructor<?> con = cls.getConstructor(String.class, int.class);
		System.out.println(con.newInstance("张三", 20));
	}

}