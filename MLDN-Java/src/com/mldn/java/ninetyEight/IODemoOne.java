package com.mldn.java.ninetyEight;

import java.io.*;

public class IODemoOne {

	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "hellofile"
				+ File.separator + "test.txt"); // ָ��һ���ļ���·����ע��ת���ַ�
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdir();
		}
		file.createNewFile();
	}

}
