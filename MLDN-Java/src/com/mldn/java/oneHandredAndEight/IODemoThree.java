package com.mldn.java.oneHandredAndEight;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

//@SuppressWarnings("serial")
//class Person3 implements Serializable {
//	private String name;
//	private int age;
//
//	public Person3(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//
//	@Override
//	public String toString() {
//		return "姓名" + this.name + "，年龄：" + this.age;
//	}
//
//}

public class IODemoThree {

	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "person2.ini");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		Object obj = ois.readObject();// 读取对象
		System.out.println(obj);
		ois.close();
	}

}
