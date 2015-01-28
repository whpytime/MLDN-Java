package com.mldn.java.oneHandredAndSeventeen;

import java.util.HashMap;
import java.util.Map;

class Student {
	private String name;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

}

public class CollectionDemoFive {

	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<String, Student>();// key�����û��Զ��������
		map.put(new String("zs"), new Student("����"));
		System.out.println(map.get(new String("zs")));
		Map<Student, String> map1 = new HashMap<Student, String>();// key���û��Զ��������
		map1.put(new Student("����"), new String("sz"));
		System.out.println(map1.get(new Student("����")));
	}

}
