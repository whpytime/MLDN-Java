package com.mldn.java.ninetyEight;

import java.io.File;
import java.io.IOException;

public class IODemoTwo {

	public static void main(String[] args) throws IOException {
		File file = new File("d:" + File.separator + "hellofile"
				+ File.separator + "test.txt"); // ָ��һ���ļ���·����ע��ת���ַ�
		if (!file.getParentFile().exists()) {// �ж��ļ������ļ����Ƿ����
			file.getParentFile().mkdir();// �����ļ���
		}
		file.createNewFile();

	}

}
