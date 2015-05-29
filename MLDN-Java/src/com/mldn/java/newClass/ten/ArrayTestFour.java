package com.mldn.java.newClass.ten;

public class ArrayTestFour {

	public static void main(String[] args) {
		int[][] data = new int[][] {{1, 2, 3}, {11, 44, 55, 22, 11}, {1}, {33, 55}};
		for(int x = 0; x < data.length; x ++){
			for(int y = 0; y < data[x].length; y++){
				System.out.print(data[x][y] + "\t");
			}
			System.out.println();
		}
	}

}
