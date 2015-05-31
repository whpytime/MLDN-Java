package com.mldn.java.newClass.twoAndThree;

public class TestDemo7 {

	public static void main(String[] args) {
		String str = "Hello";

		switch (str) {
		case "HaHa":
			System.out.println("内容是HaHa");
			break;
		case "HeHe":
			System.out.println("内容是HeHe");
			break;
		case "Hello":
			System.out.println("内容是Hello");// 执行
			break;
		default:
			System.out.println("没有内容");
		}
	}

}
