package com.mldn.java.newClass.twoAndThree;

public class TestDemo6 {

	public static void main(String[] args) {
		String str = "Hello"; // 双引号声明
		str = str + " World"; // “+”表示字符串连接
		str += "!!!"; // 表示字符串连接
		System.out.println(str); // Hello World!!!

		int numA = 10;
		double numB = 20.1;
		String strA = "计算的结果是：" + numA + numB;// numA和numB自动转换为String类型
		System.out.println(strA); // 计算的结果是：1020.1

		String strB = "计算的结果是：" + (numA + numB);
		System.out.println(strB);// 计算的结果是：30.1
	}
}
