package com.mldn.java.ninetyEight;

import java.io.File;

public class IODemoFive {

	public static void main(String[] args) {
		File file = new File("d:" + File.separator + "demo" + File.separator
				+ "demo1");
		String[] str = file.list();
		File[] fileList = file.listFiles();
		for (int x = 0; x < str.length; x++) {
			System.out.println(str[x]);
		}
		System.out.println("=====================");
		for (int x = 0; x < fileList.length; x++) {
			System.out.println(fileList[x]);
			System.out.println("��" + x + "��·����" + fileList[x].length());
			System.out.println("��" + x + "��·����" + fileList[x].canRead());
			System.out.println("��" + x + "��·����" + fileList[x].canWrite());
			System.out.println("��" + x + "��·����" + fileList[x].lastModified());
			System.out.println("��" + x + "��·����" + fileList[x].isDirectory());
			System.out.println("��" + x + "��·����" + fileList[x].isFile());
		}
	}

}
