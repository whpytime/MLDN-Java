package com.mldn.java.oneHandredAndSix;

import java.util.Scanner;

public class IODemoTwo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入数据：");
		if (scan.hasNextInt()) { // 判断输入的是否是数字
			int num = scan.nextInt(); // 接收数字
			System.out.println("输入的数据是：" + num);
		} else {
			System.out.println("错误：输入的不是数字！");
		}
	}

}
