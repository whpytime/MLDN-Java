package com.mldn.java.oneHandredAndEleven;

import java.net.ServerSocket;
import java.net.Socket;

public class MECHOServer {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9999);
		System.out.println("����������...");
		boolean flag = true;
		while (flag) {
			Socket client = server.accept(); // �ȴ��ͻ�������
			new Thread(new ECHOThread(client)).start();// �����߳�
		}
		server.close();
	}

}
