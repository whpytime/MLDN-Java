package com.mldn.java.oneHandredAndTwenty;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemoTwo {

	public static void main(String[] args) throws Exception {
		Properties pro = new Properties();
		pro.setProperty("BJ", "Beijing - ����");
		pro.setProperty("NJ", "Nanjing - �Ͼ�");
		File file = new File("d:" + File.separator + "area.properties");
		pro.store(new FileOutputStream(file), "Area Info");
	}

}
