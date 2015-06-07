package com.mldn.java.newClass.twentyTwo;

public class DemoThree {
	public static void main(String[] args) {
		Person3[] per1 = new Person3[3];
		per1[0] = new Person3("张三", 20);
		per1[1] = new Person3("李四", 30);
		per1[2] = new Person3("王武", 30);

		Person3[] per2 = new Person3[] { new Person3("张三", 20),
				new Person3("李四", 30), new Person3("王武", 30) };

		String[] names = new String[] { "张三", "李四", "王武" };
		int[] ages = new int[] { 20, 30, 40 };
		Person3[] per3 = new Person3[3];
		for (int x = 0; x < names.length; x++) {
			per3[x] = new Person3(names[x], ages[x]);
		}

		for (int x = 0; x < per1.length; x++) {
			System.out.println(per1[x].getInfo());
		}
		System.out.println("1============");
		for (int x = 0; x < per2.length; x++) {
			System.out.println(per2[x].getInfo());
		}
		System.out.println("2============");
		for (int x = 0; x < per3.length; x++) {
			System.out.println(per3[x].getInfo());
		}
	}
}

class Person3 {
	private String name;
	private int age;

	public Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getInfo() {
		return "姓名：" + this.name + "，年龄：" + this.age;
	}
}