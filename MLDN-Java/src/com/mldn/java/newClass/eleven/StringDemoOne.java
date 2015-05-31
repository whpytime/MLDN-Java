package com.mldn.java.newClass.eleven;

public class StringDemoOne {

	public static void main(String[] args) {
		String strA = "Hello";
		String strB = new String("Hello");
		String strC = strB;
		System.out.println(strA == strB);
		System.out.println(strA == strC);
		System.out.println(strC == strB);
	}

}
