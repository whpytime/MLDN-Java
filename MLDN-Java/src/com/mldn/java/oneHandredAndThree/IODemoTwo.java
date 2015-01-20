package com.mldn.java.oneHandredAndThree;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class IODemoTwo {

	public static void main(String[] args) throws Exception {
		PrintStream out = new PrintStream(new FileOutputStream(new File("d:"
				+ File.separator + "hello1.txt")));
		out.print(1);
		out.println("ÄúºÃ°¡£¡");
		out.print(10);
		out.close();
	}

}
