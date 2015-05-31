package com.mldn.java.newClass.ten;

public class ArrayTestTen {

	public static void main(String[] args) {
		int[] data = new int[] { 1, 3, 5, 7 };
		data = addLength(data, 2);
		print(data);
	}

	public static int[] addLength(int[] data, int n) {
		int[] newData = new int[data.length + n];
		System.arraycopy(data, 0, newData, 0, data.length);
		return newData;
	}

	public static void print(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "\t");
		}
	}
}
