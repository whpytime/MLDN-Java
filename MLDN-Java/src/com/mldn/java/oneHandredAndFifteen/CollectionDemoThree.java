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
		return "������" + this.name + "�����䣺" + this.age;
	}

}

public class CollectionDemoThree {

	public static void main(String[] args) {
		Set<Person> all = new TreeSet<Person>();
		all.add(new Person("����", 20));
		all.add(new Person("����", 30));
		all.add(new Person("����", 40));
		System.out.println(all);
	}

}
