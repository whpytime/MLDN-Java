package com.mldn.java.oneHandredAndFour;

import java.io.OutputStream;

public class IODemoTwo {

	public static void main(String[] args) throws Exception {
		OutputStream out = System.out; // 此处向屏幕上输出
		out.write("世界啊，你好吗？".getBytes());
	}

}
