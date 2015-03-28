package com.mldn.java.newClass.twoAndThree;

public class TestDemo2 {

	public static void main(String[] args) {
		int num = 10;
		byte b1 = (byte) num;
		byte b2 = 10;
		// byte b3 = 1000 ; //error
		System.out.println(b1); // 10
		System.out.println(b2); // 10
		System.out.println("1==============");

		int num2 = 129;
		byte b3 = (byte) num2;
		System.out.println(b3); // -127
	}

}
