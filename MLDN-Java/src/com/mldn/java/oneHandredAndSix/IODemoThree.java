package com.mldn.java.oneHandredAndSix;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class IODemoThree {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入数据：");
		if (scan.hasNext("\\d(4)-\\d(2)-\\d(2)")) {// 判断是否是数字
			String str = scan.next(); // 接收字符串
			Date date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
			System.out.println("输入的数据是：" + date);
		} else {
			System.out.println("错误：输入的不是日期！");
		}
	}

}
