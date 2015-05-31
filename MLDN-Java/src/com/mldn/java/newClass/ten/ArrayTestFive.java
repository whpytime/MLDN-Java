package com.mldn.java.newClass.ten;

public class ArrayTestFive {

	public static void main(String[] args) {
		int[] data = init();
		for(int i = 0; i < data.length; i++){
			System.out.println(data[i]);
		}				
	}
	
	public static int[] init(){
		int[] data = new int[] {11, 22, 33, 44, 55};
		return data;
	}
}
