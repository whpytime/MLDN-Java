package com.mldn.java.oneHandredAndFour;

import java.io.InputStream;

public class IODemoFour {

	public static void main(String[] args) throws Exception {
		InputStream in = System.in;
		System.out.println("��������Ҫ��������ݣ�");
		StringBuffer buf = new StringBuffer();
		int temp = 0;
		while ((temp = in.read()) != -1) {
			if (temp == '\n') {
				break;
			}
			buf.append((char) temp);
		}
		System.out.println("������������ǣ�" + buf);
	}

}
