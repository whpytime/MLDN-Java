package com.mldn.java.oneHandredAndFifteen;

import java.util.HashSet;
import java.util.Set;

class Person5 {
	private String name;
	private int age;

	public Person5(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "姓名：" + this.name + "，年龄：" + this.age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person5 other = (Person5) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class CollectionDemoFive {

	public static void main(String[] args) {
		Set<Person5> all = new HashSet<Person5>();
		all.add(new Person5("张三", 20));
		all.add(new Person5("张三", 20));
		all.add(new Person5("李四", 19));
		all.add(new Person5("王五", 21));
		all.add(new Person5("赵六", 21));
		all.remove(new Person5("张三", 20));
		System.out.println(all);
	}

}
