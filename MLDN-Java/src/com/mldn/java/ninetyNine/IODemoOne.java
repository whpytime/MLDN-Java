package com.mldn.java.ninetyNine;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class IODemoOne {

	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "testjava"
				+ File.separator + "myinfo.txt");
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();// �ȴ����ļ����ļ���
		}
		OutputStream out = new FileOutputStream(file);// ����ת��
		String str = "Hello, World!";// �ַ���
		byte[] data = str.getBytes();// ���ַ���ת��Ϊ�ַ�����
		out.write(data);// ȫ�����
		out.write(99);
		out.write(data, 0, 5);
		out.close();// �ر�
	}

}
