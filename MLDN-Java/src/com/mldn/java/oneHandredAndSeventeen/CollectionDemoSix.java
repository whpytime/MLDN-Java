package com.mldn.java.oneHandredAndSeventeen;

import java.util.HashMap;
import java.util.Map;

class Student2 {
	private String name;

	public Student2(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student2 other = (Student2) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class CollectionDemoSix {

	public static void main(String[] args) {
		Map<String, Student2> map = new HashMap<String, Student2>();// key不是用户自定义的类型
		map.put(new String("zs"), new Student2("张三"));
		System.out.println(map.get(new String("zs")));

		Map<Student2, String> map1 = new HashMap<Student2, String>();// key是用户自定义的类型
		map1.put(new Student2("李四"), new String("sz"));
		System.out.println(map1.get(new Student2("李四")));
	}

}
