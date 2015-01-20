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
			System.out.println("命令操作语法不正确。");
			System.exit(1);// 程序退出
		}
		File inFile = new File(args[0]);// 源文件路径
		if (!inFile.exists()) {
			System.out.println("源文件不存在。");
			System.exit(1);
		}
		File outFile = new File(args[1]);// 输出文件路径
		if (!outFile.getParentFile().exists()) {
			outFile.getParentFile().mkdirs();
		}
		InputStream in = new FileInputStream(inFile);
		OutputStream out = new FileOutputStream(outFile);
		byte[] buf = new byte[1024];// 每次拷贝1024字节的内容
		int temp = 0;
		while ((temp = in.read(buf)) != -1) {// 向buf中读取数据
			out.write(buf, 0, temp);// 输出部分内容
		}
		in.close();
		out.close();
	}

}
