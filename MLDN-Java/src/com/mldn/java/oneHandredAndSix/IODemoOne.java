package com.mldn.java.oneHandredAndSix;

import java.util.Scanner;

public class IODemoOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 直接包装InputStream
		System.out.println("请输入数据：");
		if (scan.hasNext()) { // 有数据
			String str = scan.next(); // 取出数据
			System.out.println("输入的数据是：" + str);
		}
		scan.close();
	}

}
