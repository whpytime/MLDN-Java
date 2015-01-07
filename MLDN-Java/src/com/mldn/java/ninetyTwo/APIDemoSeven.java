package com.mldn.java.ninetyTwo;

import java.lang.reflect.Constructor;

class Person1 {
	private String name;
	private int age;

	public Person1() {

	}

	public Person1(String name) {
		this.name = name;
	}

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "������" + this.name + "�����䣺" + this.age;
	}

}

public class APIDemoSeven {

	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("com.mldn.java.ninetyTwo.Person1");
		Constructor[] cons = cls.getConstructors(); // ȡ��ȫ������
		for (int x = 0; x < cons.length; x++) {
			System.out.println(cons[x]);
		}
	}

}
















