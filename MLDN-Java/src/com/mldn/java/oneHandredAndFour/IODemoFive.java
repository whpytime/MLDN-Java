package com.mldn.java.oneHandredAndFour;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IODemoFive {

	public static void main(String[] args) throws Exception {
		BufferedReader buf = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("请输入您要输入的数据：");
		String str = buf.readLine();// 读取数据
		System.out.println("输入的数据是：" + str);

	}

}
