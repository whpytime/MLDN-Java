package com.mldn.java.oneHandredAndSix;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class IODemoThree {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("���������ݣ�");
		if (scan.hasNext("\\d(4)-\\d(2)-\\d(2)")) {// �ж��Ƿ�������
			String str = scan.next(); // �����ַ���
			Date date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
			System.out.println("����������ǣ�" + date);
		} else {
			System.out.println("��������Ĳ������ڣ�");
		}
	}

}
