package com.mldn.java.oneHandredAndTen;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9999); // 在9999端口监听连接
		// 一个端口之后能绑定一个监听服务
		System.out.println("服务器端已经启动...");
		Socket client = server.accept(); // 等待客户端连接
		String data = "Hello World!"; // 要传输的数据
		PrintStream out = new PrintStream(client.getOutputStream());// 准备输出
		out.print(data);// 直接输出
		out.close();
		client.close();
		server.close();
	}

}
