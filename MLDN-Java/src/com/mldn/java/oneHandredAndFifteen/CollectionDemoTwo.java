package com.mldn.java.oneHandredAndFifteen;

import java.util.Set;
import java.util.TreeSet;


public class CollectionDemoTwo {

	public static void main(String[] args) {
		Set<String> all = new TreeSet<String>();
		System.out.println("�����Ƿ�Ϊ�գ�" + all.isEmpty());
		all.add("B");
		all.add("C");// �ظ�����
		all.add("A");
		all.add("A");
		System.out.println("�����Ƿ�Ϊ�գ�" + all.isEmpty());
		System.out.println(all);
	}

}
