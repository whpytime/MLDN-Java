package com.mldn.java.newClass.twelve;

public class StringDemoOne {
	public static void main(String args[]) {
		String str = "hello World";
		System.out.println(initCap(str));
	}

	public static String initCap(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
}
