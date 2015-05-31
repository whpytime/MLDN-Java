package com.mldn.java.newClass.ten;

public class ArrayTestThree {

	public static void main(String[] args) {
		int[] data = new int[] { 11, 5, 666, 22, 2, 555, 8, 12 };
		print(data);
		sort(data);
		print(data);
	}

	public static void sort(int[] data) {
		for (int x = 0; x < data.length - 1; x++) {
			for (int y = x + 1; y < data.length; y++) {
				if (data[x] > data[y]) {
					int temp = data[x];
					data[x] = data[y];
					data[y] = temp;
				}
			}
		}
	}

	public static void print(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "\t");
		}
		System.out.println();
		System.out.println();
	}
}
