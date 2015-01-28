package com.mldn.java.oneHandredAndFifteen;

import java.util.Set;
import java.util.TreeSet;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "姓名：" + this.name + "，年龄：" + this.age;
	}

}

public class CollectionDemoThree {

	public static void main(String[] args) {
		Set<Person> all = new TreeSet<Person>();
		all.add(new Person("张三", 20));
		all.add(new Person("李四", 30));
		all.add(new Person("王五", 40));
		System.out.println(all);
	}

}
