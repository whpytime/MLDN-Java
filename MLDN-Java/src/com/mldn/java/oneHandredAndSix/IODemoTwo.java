package com.mldn.java.oneHandredAndSix;

import java.util.Scanner;

public class IODemoTwo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���������ݣ�");
		if (scan.hasNextInt()) { // �ж�������Ƿ�������
			int num = scan.nextInt(); // ��������
			System.out.println("����������ǣ�" + num);
		} else {
			System.out.println("��������Ĳ������֣�");
		}
	}

}
