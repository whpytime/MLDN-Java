package com.mldn.java.oneHandredAndThree;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class IODemoThree {

	public static void main(String[] args) throws Exception {
		String str = "hello, china!";
		InputStream in = new ByteArrayInputStream(str.getBytes()); // 将数据输出到内存
		OutputStream out = new ByteArrayOutputStream();// 从内存中取出数据
		PrintStream print = new PrintStream(out);// 只能封装输出流
		int temp = 0;
		while ((temp = in.read()) != -1) {
			// 现在是借用了PrintStream类封装了ByteArrayOutputStream类，实际上还是向内存输出
			print.print((char) Character.toUpperCase(temp));
		}
		String data = out.toString();
		in.close();
		out.close();
		System.out.println(data);
	}

}
