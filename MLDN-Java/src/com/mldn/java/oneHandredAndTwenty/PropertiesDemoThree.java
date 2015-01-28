package com.mldn.java.oneHandredAndTwenty;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemoThree {

	public static void main(String[] args) throws Exception {
		Properties pro = new Properties();
		File file = new File("d:" + File.separator + "area.properties");
		pro.load(new FileInputStream(file));
		System.out.println(pro.getProperty("BJ"));
		System.out.println(pro.getProperty("TJ"));
	}

}
