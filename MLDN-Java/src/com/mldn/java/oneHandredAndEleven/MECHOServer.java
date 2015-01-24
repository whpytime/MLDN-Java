package com.mldn.java.oneHandredAndEleven;

import java.net.ServerSocket;
import java.net.Socket;

public class MECHOServer {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9999);
		System.out.println("服务器启动...");
		boolean flag = true;
		while (flag) {
			Socket client = server.accept(); // 等待客户端连接
			new Thread(new ECHOThread(client)).start();// 启动线程
		}
		server.close();
	}

}
