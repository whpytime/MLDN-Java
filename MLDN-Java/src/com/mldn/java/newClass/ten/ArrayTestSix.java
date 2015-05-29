package com.mldn.java.newClass.ten;

public class ArrayTestSix {

	public static void main(String[] args) {
		int searchData = 33;
		int[] data = new int[] { 1, 4, 5, 3, 55, 111 };
		boolean flag = isExists(data, searchData);
		if (flag) {
			System.out.println("find!");
		} else {
			System.out.println("not find.");
		}
	}

	public static boolean isExists(int[] data, int searchData) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == searchData) {
				return true;
			}
		}
		return false;
	}
}
