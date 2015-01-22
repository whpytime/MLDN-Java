package com.mldn.java.oneHandredAndEight;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class Person2 implements Serializable {
	private String name;
	private int age;

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "姓名" + this.name + "，年龄：" + this.age;
	}

}

public class IODemoTwo {

	public static void main(String[] args) throws Exception, IOException {
		Person2 per = new Person2("张三", 20);
		File file = new File("d:" + File.separator + "person2.ini");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				file));
		oos.writeObject(per);// 输出对象
		oos.close();
	}

}
