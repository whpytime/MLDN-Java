package com.mldn.java.oneHandredAndEleven;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ECHOServer {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9999);
		System.out.println("����������...");
		Socket client = server.accept(); // �ȴ��ͻ�������
		System.out.println("�ͻ������ӳɹ�...");
		Scanner clientScan = new Scanner(client.getInputStream());// �õ��ͻ�������
		boolean flag = true;
		while (flag) {
			if (clientScan.hasNext()) {
				String data = clientScan.next();// ȡ������
				if ("byebye".equalsIgnoreCase(data)) {// �յ��˳�����
					flag = false;// ����ѭ��
				}
				PrintStream clientPrint = new PrintStream(
						client.getOutputStream());
				clientPrint.println("ECHO��" + data);// ����������ͻ���
			}
		}
		System.out.println("��ͻ��˹ر����ӣ�");
		clientScan.close();
		client.close();
		server.close();
	}

}
