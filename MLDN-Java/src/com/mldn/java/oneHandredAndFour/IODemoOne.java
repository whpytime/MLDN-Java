package com.mldn.java.oneHandredAndFour;

public class IODemoOne {

	public static void main(String[] args) {
		try {
			Integer.parseInt("fafs");
		} catch (Exception e) {
			System.out.println(e); // �������Ϊ��ɫ
			System.err.println(e); // �������Ϊ��ɫ
		}
	}

}
