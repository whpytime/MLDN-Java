package com.mldn.java.oneHandredAndEleven;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ECHOThread implements Runnable {
	private Socket client = null;

	public ECHOThread(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		try {
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
			clientScan.close();
			this.client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
