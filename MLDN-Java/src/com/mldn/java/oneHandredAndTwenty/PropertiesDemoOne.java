package com.mldn.java.oneHandredAndTwenty;

import java.util.Properties;

public class PropertiesDemoOne {

	public static void main(String[] args) {
		Properties pro = new Properties();
		pro.setProperty("BJ", "Beijing - ����");
		pro.setProperty("NJ", "Nanjing - �Ͼ�");
		System.out.println(pro.getProperty("BJ"));
		System.out.println(pro.getProperty("TJ"));
		System.out.println(pro.getProperty("TJ", "û�з��֣�"));
	}

}
