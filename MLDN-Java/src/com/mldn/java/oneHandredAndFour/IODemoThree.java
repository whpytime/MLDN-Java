package com.mldn.java.oneHandredAndFour;

import java.io.InputStream;

public class IODemoThree {

	public static void main(String[] args) throws Exception {
		InputStream in = System.in;
		System.out.println("请输入您要输入的数据：");
		byte[] data = new byte[1024]; // 装载数据的buf
		int len = in.read(data); // 向data中保存
		System.out.println("您输入的数据是：" + new String(data, 0, len));
	}

}
