package com.mldn.java.oneHandredAndThree;

public class IODemoFive {

	public static void main(String[] args) {
		String name = "张三";
		int age = 20;
		double score = 90.557;
		String str = String.format("姓名：%s，年龄：%d，成绩：%3.1f", name, age, score);
		System.out.println(str);
	}

}
