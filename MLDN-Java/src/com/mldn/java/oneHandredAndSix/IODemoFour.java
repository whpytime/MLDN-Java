package com.mldn.java.oneHandredAndSix;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class IODemoFour {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(new FileInputStream(new File("d:"
				+ File.separator + "hello.txt"))); // ֱ�Ӱ�װInputStream��
		scan.useDelimiter("\n"); // ��������Ϊ�ָ���
		while (scan.hasNext()) { // ������
			System.out.print(scan.next());
		}

	}

}
