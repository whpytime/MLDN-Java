package com.mldn.java.oneHandredAndEight;

import java.io.Serializable;

@SuppressWarnings("serial")
class Person implements Serializable {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "ĞÕÃû" + this.name + "£¬ÄêÁä£º" + this.age;
	}

}

public class IODemoOne {

	public static void main(String[] args) {

	}

}
