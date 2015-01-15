package com.mldn.java.ninetyTwo;

public class APIDemoThree {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> cls = Class.forName("java.util.Date");
		System.out.println(cls.getName());
	}

}
