package com.mldn.java.oneHandredAndFifteen;

import java.util.Set;
import java.util.TreeSet;

class Person4 implements Comparable<Person4> {
	private String name;
	private int age;

	public Person4(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "姓名：" + this.name + "，年龄：" + this.age;
	}

	@Override
	public int compareTo(Person4 o) {
		if (this.age > o.age) {
			return 1;
		} else if (this.age < o.age) {
			return -1;
		} else {
			return this.name.compareTo(o.name);
		}
	}

}

public class CollectionDemoFour {

	public static void main(String[] args) {
		Set<Person4> all = new TreeSet<Person4>();
		all.add(new Person4("张三", 20));
		all.add(new Person4("张三", 20));
		all.add(new Person4("李四", 19));
		all.add(new Person4("王五", 21));
		all.add(new Person4("赵六", 21));
		System.out.println(all);
	}

}
