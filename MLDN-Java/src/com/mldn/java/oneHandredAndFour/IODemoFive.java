package com.mldn.java.oneHandredAndFour;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IODemoFive {

	public static void main(String[] args) throws Exception {
		BufferedReader buf = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("��������Ҫ��������ݣ�");
		String str = buf.readLine();// ��ȡ����
		System.out.println("����������ǣ�" + str);

	}

}
