package com.mldn.java.oneHandredAndThree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class IODemoFour {

	public static void main(String[] args) throws Exception {
		PrintStream out = new PrintStream(new FileOutputStream(new File("d:"
				+ File.separator + "hello2.txt")));
		String name = "张三";
		int age = 20;
		double score = 89.183456;
		out.printf("姓名：%s，年龄：%d，成绩：%3.1f", name, age, score);
		out.close();
	}

}
