package com.mldn.java.newClass.eleven;

public class StringDemoTwo {
	public static void main(String[] args) {
		String strA = "Hello";
		String strB = new String("Hello");
		String strC = strB;
		System.out.println(strA.equals(strB));
		System.out.println(strA.equals(strC));
		System.out.println(strC.equals(strB));
	}
}
