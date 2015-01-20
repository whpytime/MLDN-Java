package com.mldn.java.oneHandredAndTwo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IODemoOne {

	public static void main(String[] args) throws Exception {
		String str = "hello, world.";
		InputStream in = new ByteArrayInputStream(str.getBytes()); // ������������ڴ�
		OutputStream out = new ByteArrayOutputStream(); // ���ڴ���ȡ������
		int temp = 0;
		while ((temp = in.read()) != -1) {
			out.write(Character.toUpperCase(temp));
		}
		String data = out.toString(); // ȡ������
		in.close();
		out.close();
		System.out.println(data);
	}

}
