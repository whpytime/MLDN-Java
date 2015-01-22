package com.mldn.java.oneHandredAndSeven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class IODemoTwo {

	public static void main(String[] args) throws Exception {
		OutputStream out = new FileOutputStream(new File("d:" + File.separator
				+ "hello.txt"));
		out.write("世界啊，你好！".getBytes("ISO8859-1"));// 强制更改编码
		out.close();
	}

}
