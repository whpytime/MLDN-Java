package com.mldn.java.oneHandredAndFour;

import java.io.InputStream;

public class IODemoThree {

	public static void main(String[] args) throws Exception {
		InputStream in = System.in;
		System.out.println("��������Ҫ��������ݣ�");
		byte[] data = new byte[1024]; // װ�����ݵ�buf
		int len = in.read(data); // ��data�б���
		System.out.println("������������ǣ�" + new String(data, 0, len));
	}

}
