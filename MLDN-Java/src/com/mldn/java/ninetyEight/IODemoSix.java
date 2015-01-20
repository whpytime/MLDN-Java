package com.mldn.java.ninetyEight;

import java.io.File;

public class IODemoSix {

	public static void main(String[] args) {
		File file = new File("d:" + File.separator + "ÉúÓý");
		if (file.isDirectory()) {
			System.out.println(file + "\\");
			File[] f = file.listFiles();
			listFile(f);
		} else {
			System.out.println(file);
		}
	}

	public static void listFile(File[] f) {
		for (int x = 0; x < f.length; x++) {
			if (f[x].isDirectory()) {
				System.out.println(f[x] + "\\");
				File[] f1 = f[x].listFiles();
				if (f1 != null) {
					listFile(f1);
				}
			} else {
				System.out.println(f[x]);
			}
		}
	}
}
