package com.mldn.java.oneHandredAndTen;

import java.net.Socket;
import java.util.Scanner;

public class HelloClient {

	public static void main(String[] args) throws Exception {
		Socket client = new Socket("localhost", 9999);// ������ʾ�����������ƣ�IP��ַ���ͼ����˿ں�
		Scanner scan = new Scanner(client.getInputStream());
		scan.useDelimiter("\n");
		if (scan.hasNext()) {
			System.out.println(scan.next());
		}
		scan.close();
	}

}
