package com.mldn.java.ninetyEight;

import java.io.File;

public class IODemoFour {

	public static void main(String[] args) {
		File file = new File("d:" + File.separator + "demo" + File.separator
				+ "demo1" + File.separator + "demo.txt");
		if (file.exists()) {
			System.out.println("�ļ����ȣ�" + file.length());
			System.out.println("�ļ��Ƿ�ɶ���" + file.canRead());
			System.out.println("�ļ��Ƿ��д��" + file.canWrite());
			System.out.println("�ļ��Ƿ��ִ�У�" + file.canExecute());
			System.out.println("�ļ��Ƿ��ִ�У�" + file.isDirectory());
			System.out.println("�ļ��Ƿ��ִ�У�" + file.isFile());
			System.out.println("�ļ��Ƿ��ִ�У�" + file.getParentFile().isFile());
			System.out.println("�ļ��Ƿ��ִ�У�" + file.lastModified());
		}
	}

}
