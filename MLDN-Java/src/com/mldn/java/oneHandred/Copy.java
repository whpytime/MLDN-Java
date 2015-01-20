package com.mldn.java.oneHandred;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy {

	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			System.out.println("��������﷨����ȷ��");
			System.exit(1);// �����˳�
		}
		File inFile = new File(args[0]);// Դ�ļ�·��
		if (!inFile.exists()) {
			System.out.println("Դ�ļ������ڡ�");
			System.exit(1);
		}
		File outFile = new File(args[1]);// ����ļ�·��
		if (!outFile.getParentFile().exists()) {
			outFile.getParentFile().mkdirs();
		}
		InputStream in = new FileInputStream(inFile);
		OutputStream out = new FileOutputStream(outFile);
		byte[] buf = new byte[1024];// ÿ�ο���1024�ֽڵ�����
		int temp = 0;
		while ((temp = in.read(buf)) != -1) {// ��buf�ж�ȡ����
			out.write(buf, 0, temp);// �����������
		}
		in.close();
		out.close();
	}

}
