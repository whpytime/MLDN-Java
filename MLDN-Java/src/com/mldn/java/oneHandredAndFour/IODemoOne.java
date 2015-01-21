package com.mldn.java.oneHandredAndFour;

public class IODemoOne {

	public static void main(String[] args) {
		try {
			Integer.parseInt("fafs");
		} catch (Exception e) {
			System.out.println(e); // 输出的字为黑色
			System.err.println(e); // 输出的字为红色
		}
	}

}
