package com.mldn.java.oneHandredAndFifteen;

import java.util.HashSet;
import java.util.Set;


public class CollectionDemoOne {

	public static void main(String[] args) {
		Set<String> all = new HashSet<String>();
		System.out.println("�����Ƿ�Ϊ�գ�" + all.isEmpty());
		all.add("Hello");
		all.add("Hello");// �ظ�����
		all.add("world");
		all.add("mldn");
		System.out.println("�����Ƿ�Ϊ�գ�" + all.isEmpty());
		System.out.println(all);
	}

}
