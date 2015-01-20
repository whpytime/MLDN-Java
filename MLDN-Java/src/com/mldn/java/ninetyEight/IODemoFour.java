package com.mldn.java.ninetyEight;

import java.io.File;

public class IODemoFour {

	public static void main(String[] args) {
		File file = new File("d:" + File.separator + "demo" + File.separator
				+ "demo1" + File.separator + "demo.txt");
		if (file.exists()) {
			System.out.println("文件长度：" + file.length());
			System.out.println("文件是否可读：" + file.canRead());
			System.out.println("文件是否可写：" + file.canWrite());
			System.out.println("文件是否可执行：" + file.canExecute());
			System.out.println("文件是否可执行：" + file.isDirectory());
			System.out.println("文件是否可执行：" + file.isFile());
			System.out.println("文件是否可执行：" + file.getParentFile().isFile());
			System.out.println("文件是否可执行：" + file.lastModified());
		}
	}

}
