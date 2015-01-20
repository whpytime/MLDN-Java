package com.mldn.java.oneHandredAndOne;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class StreamOne {

	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "testjava.txt");
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		OutputStream out = new FileOutputStream(file);
		Writer w = new OutputStreamWriter(out);// 字节流转换为字符流
		String str = "Hello, world. ";
		w.write(str);
		w.close();
		out.close();
	}

}
