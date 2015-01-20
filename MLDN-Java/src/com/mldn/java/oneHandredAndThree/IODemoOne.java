package com.mldn.java.oneHandredAndThree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class PrintUtil {
	private OutputStream out = null;

	public PrintUtil(OutputStream out) {
		this.out = out;
	}

	public void print(String data) { // Êä³ö×Ö·û´®
		try {
			this.out.write(data.getBytes());
			// this.out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void println(String data) {
		this.print(data + "\r\n");
	}

	public void print(int data) { // Êä³öÊý×Ö
		this.print(String.valueOf(data));
	}

	public void println(int data) {
		this.print(String.valueOf(data) + "\r\n");
	}

	public void close() {
		try {
			this.out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

public class IODemoOne {

	public static void main(String[] args) throws Exception {
		PrintUtil pu = new PrintUtil(new FileOutputStream(new File("d:"
				+ File.separator + "hello.txt")));

		pu.println(1);
		pu.println("ÄúºÃ£¡");
		pu.println(10);
		pu.close();
	}
}
