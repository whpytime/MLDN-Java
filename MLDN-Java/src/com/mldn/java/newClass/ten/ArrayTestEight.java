package com.mldn.java.newClass.ten;

public class ArrayTestEight {

	public static void main(String[] args) {
		int[][] data = new int[][] {{0, 1, 2, 3}, 
									{4, 5, 6, 7}, 
									{8, 9, 10, 11}, 
									{12, 13, 14, 15}};
		reverse(data);
		print(data);
	}

	public static void reverse(int[][] data){
		for(int x = 0; x < data.length; x++){
			for(int y = x + 1; y < data[x].length; y++){
				int temp = data[x][y];
				data[x][y] = data[y][x];
				data[y][x] = temp;
			}
		}
	}
	
	public static void print(int[][] data){
		for(int x = 0; x < data.length; x++){
			for(int y = 0; y < data[x].length; y++){
				System.out.print(data[x][y] + "\t");
			}
			System.out.println();
		}
	}
}
