package com.mldn.java.oneHandredAndTen;

import java.net.Socket;
import java.util.Scanner;

public class HelloClient {

	public static void main(String[] args) throws Exception {
		Socket client = new Socket("localhost", 9999);// 参数表示服务器端名称（IP地址）和监听端口号
		Scanner scan = new Scanner(client.getInputStream());
		scan.useDelimiter("\n");
		if (scan.hasNext()) {
			System.out.println(scan.next());
		}
		scan.close();
	}

}
