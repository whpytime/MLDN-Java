package com.mldn.java.newClass.four;

public class TestDemo {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(add(n));
	}

	public static int add(int n) {
		if (n == 1) {
			return 20;
		} else {
			return 2 + add(n - 1);
		}
	}
}
