package com.mldn.java.newClass.ten;

public class ArrayTestSeven {

	public static void main(String[] args) {
		double[] data = init();
		print(data);
		double[] did = deal(data);		
		System.out.println("数组的和为：" + did[0]);
		System.out.println("数组的平均值为：" + did[1]);
		System.out.println("数组的最大值为：" + did[2]);
		System.out.println("数组的最小值为：" + did[3]);
	}

	public static double[] init() {
		return new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 };
	}

	public static double[] deal(double[] data) {
		double[] did = new double[4];
		did[0] = sum(data);
		did[1] = avg(data);
		did[2] = max(data);
		did[3] = min(data);
		return did;
	}

	public static double sum(double[] data) {
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum = sum + data[i];
		}
		return sum;
	}

	public static double avg(double[] data) {
		return sum(data) / data.length;
	}

	public static double max(double[] data) {
		double temp = data[0];
		for (int i = 1; i < data.length; i++) {
			if(temp < data[i]){
				temp = data[i];
			}				
		}
		return temp;
	}

	public static double min(double[] data) {
		double temp = data[0];
		for (int i = 1; i < data.length; i++) {
			if(temp > data[i]){
				temp = data[i];
			}				
		}
		return temp;
	}
	
	public static void print(double[] data){
		for(int i = 0; i < data.length; i++){
			System.out.print(data[i] + "\t");
		}
		System.out.println();
	}
}
