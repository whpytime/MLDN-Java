package com.mldn.java.newClass.ten;

public class ArrayTest {

	public static void main(String[] args) {
		int[] data = new int[3];
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		System.out.println("1--------------------");

		int[] data1;
		data1 = new int[3];
		data1[0] = 1;
		data1[1] = 2;
		data1[2] = 3;
		for(int i = 0; i < data1.length; i++){
			System.out.println(data1[i]);
		}
		System.out.println("2--------------------");
		
		int[] arr = data;
		arr[0] = 8000;
		for(int i = 0; i < data.length; i++){
			System.out.println(data[i]);
		}
	}

}
