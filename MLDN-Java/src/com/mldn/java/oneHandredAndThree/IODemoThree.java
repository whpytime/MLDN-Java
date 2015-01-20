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
		InputStream in = new ByteArrayInputStream(str.getBytes()); // ������������ڴ�
		OutputStream out = new ByteArrayOutputStream();// ���ڴ���ȡ������
		PrintStream print = new PrintStream(out);// ֻ�ܷ�װ�����
		int temp = 0;
		while ((temp = in.read()) != -1) {
			// �����ǽ�����PrintStream���װ��ByteArrayOutputStream�࣬ʵ���ϻ������ڴ����
			print.print((char) Character.toUpperCase(temp));
		}
		String data = out.toString();
		in.close();
		out.close();
		System.out.println(data);
	}

}
