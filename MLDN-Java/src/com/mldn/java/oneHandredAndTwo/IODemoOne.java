package com.mldn.java.oneHandredAndTwo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IODemoOne {

	public static void main(String[] args) throws Exception {
		String str = "hello, world.";
		InputStream in = new ByteArrayInputStream(str.getBytes()); // 将数据输出到内存
		OutputStream out = new ByteArrayOutputStream(); // 从内存中取出数据
		int temp = 0;
		while ((temp = in.read()) != -1) {
			out.write(Character.toUpperCase(temp));
		}
		String data = out.toString(); // 取出数据
		in.close();
		out.close();
		System.out.println(data);
	}

}
