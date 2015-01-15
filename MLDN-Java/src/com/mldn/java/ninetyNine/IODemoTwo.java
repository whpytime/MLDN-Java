package com.mldn.java.ninetyNine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class IODemoTwo {

	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "testjava" + File.separator + "myInfo.txt");
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		OutputStream out = new FileOutputStream(file, true);
		String str = "Hello, world .\r\n";
		byte[] data = str.getBytes();
		out.write(data);
		out.close();
	}

}
