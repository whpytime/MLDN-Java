package com.mldn.java.oneHandredAndTen;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9999); // ��9999�˿ڼ�������
		// һ���˿�֮���ܰ�һ����������
		System.out.println("���������Ѿ�����...");
		Socket client = server.accept(); // �ȴ��ͻ�������
		String data = "Hello World!"; // Ҫ���������
		PrintStream out = new PrintStream(client.getOutputStream());// ׼�����
		out.print(data);// ֱ�����
		out.close();
		client.close();
		server.close();
	}

}
