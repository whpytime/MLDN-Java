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
		return "����" + this.name + "�����䣺" + this.age;
	}

}

public class IODemoTwo {

	public static void main(String[] args) throws Exception, IOException {
		Person2 per = new Person2("����", 20);
		File file = new File("d:" + File.separator + "person2.ini");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				file));
		oos.writeObject(per);// �������
		oos.close();
	}

}
