package com.mldn.java.ninetyEight;

import java.io.File;
import java.io.IOException;

public class IODemoThree {

	public static void main(String[] args) throws IOException {
		File file = new File("d:" + File.separator + "hellofile"
				+ File.separator + "demo" + File.separator + "test"
				+ File.separator + "test.txt"); // ָ��һ���ļ���·����ע��ת���ַ�
		if (!file.getParentFile().exists()) {// �ж��ļ������ļ����Ƿ����
			file.getParentFile().mkdirs();// �����ļ���
		}
		file.createNewFile();
	}

}
