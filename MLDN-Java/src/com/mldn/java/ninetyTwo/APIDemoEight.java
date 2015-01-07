package com.mldn.java.ninetyTwo;

class Person2 {
	private String name;
	private int age;

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "–’√˚£∫" + this.name + "£¨ƒÍ¡‰£∫" + this.age;
	}

}

public class APIDemoEight {

	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("com.mldn.java.ninetyTwo.Person2");
		System.out.println(cls.newInstance());
	}

}
