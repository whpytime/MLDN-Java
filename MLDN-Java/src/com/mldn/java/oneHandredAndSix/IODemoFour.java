package com.mldn.java.oneHandredAndSix;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class IODemoFour {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(new FileInputStream(new File("d:"
				+ File.separator + "hello.txt"))); // 直接包装InputStream类
		scan.useDelimiter("\n"); // 将换行作为分隔符
		while (scan.hasNext()) { // 有内容
			System.out.print(scan.next());
		}

	}

}
