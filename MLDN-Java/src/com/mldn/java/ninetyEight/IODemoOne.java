package com.mldn.java.ninetyEight;

import java.io.*;

public class IODemoOne {

	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "hellofile"
				+ File.separator + "test.txt"); // 指定一个文件的路径，注意转义字符
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdir();
		}
		file.createNewFile();
	}

}
