package com.mldn.java.oneHandredAndTwenty;

import java.util.Properties;

public class PropertiesDemoOne {

	public static void main(String[] args) {
		Properties pro = new Properties();
		pro.setProperty("BJ", "Beijing - 北京");
		pro.setProperty("NJ", "Nanjing - 南京");
		System.out.println(pro.getProperty("BJ"));
		System.out.println(pro.getProperty("TJ"));
		System.out.println(pro.getProperty("TJ", "没有发现！"));
	}

}
