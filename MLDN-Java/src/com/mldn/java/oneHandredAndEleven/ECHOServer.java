package com.mldn.java.oneHandredAndEleven;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ECHOServer {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9999);
		System.out.println("服务器启动...");
		Socket client = server.accept(); // 等待客户端连接
		System.out.println("客户端连接成功...");
		Scanner clientScan = new Scanner(client.getInputStream());// 得到客户端输入
		boolean flag = true;
		while (flag) {
			if (clientScan.hasNext()) {
				String data = clientScan.next();// 取出数据
				if ("byebye".equalsIgnoreCase(data)) {// 收到退出命令
					flag = false;// 结束循环
				}
				PrintStream clientPrint = new PrintStream(
						client.getOutputStream());
				clientPrint.println("ECHO：" + data);// 发送输入给客户端
			}
		}
		System.out.println("与客户端关闭连接！");
		clientScan.close();
		client.close();
		server.close();
	}

}
