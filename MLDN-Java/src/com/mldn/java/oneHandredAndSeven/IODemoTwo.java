package com.mldn.java.oneHandredAndSeven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class IODemoTwo {

	public static void main(String[] args) throws Exception {
		OutputStream out = new FileOutputStream(new File("d:" + File.separator
				+ "hello.txt"));
		out.write("���簡����ã�".getBytes("ISO8859-1"));// ǿ�Ƹ��ı���
		out.close();
	}

}
