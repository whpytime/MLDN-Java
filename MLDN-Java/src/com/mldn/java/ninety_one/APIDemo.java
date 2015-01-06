package com.mldn.java.ninety_one;

public class APIDemo {

	public static void main(String[] args) {
		String str = "1231231";
		System.out.println(isNumber(str));
	}

	public static boolean isNumber(String data) {
		char[] arr = data.toCharArray();
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] < '0' || arr[x] > '9') {
				return false;
			}
		}
		return true;
	}
}
