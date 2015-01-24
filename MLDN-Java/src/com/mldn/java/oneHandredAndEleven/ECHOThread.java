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
			clientScan.close();
			this.client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
