package com.mldn.java.ninetyEight;

import java.io.File;
import java.io.IOException;

public class IODemoTwo {

	public static void main(String[] args) throws IOException {
		File file = new File("d:" + File.separator + "hellofile"
				+ File.separator + "test.txt"); // 指定一个文件的路径，注意转义字符
		if (!file.getParentFile().exists()) {// 判断文件所在文件夹是否存在
			file.getParentFile().mkdir();// 创建文件夹
		}
		file.createNewFile();

	}

}
