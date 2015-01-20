package com.mldn.java.ninetyNine;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class IODemoOne {

	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "testjava"
				+ File.separator + "myinfo.txt");
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();// 先创建文件和文件夹
		}
		OutputStream out = new FileOutputStream(file);// 向上转型
		String str = "Hello, World!";// 字符串
		byte[] data = str.getBytes();// 将字符串转换为字符数组
		out.write(data);// 全部输出
		out.write(99);
		out.write(data, 0, 5);
		out.close();// 关闭
	}

}
