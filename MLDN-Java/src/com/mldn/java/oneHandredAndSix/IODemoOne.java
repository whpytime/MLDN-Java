package com.mldn.java.oneHandredAndSix;

import java.util.Scanner;

public class IODemoOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // ֱ�Ӱ�װInputStream
		System.out.println("���������ݣ�");
		if (scan.hasNext()) { // ������
			String str = scan.next(); // ȡ������
			System.out.println("����������ǣ�" + str);
		}
		scan.close();
	}

}
