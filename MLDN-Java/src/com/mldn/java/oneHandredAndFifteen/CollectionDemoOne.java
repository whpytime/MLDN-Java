package com.mldn.java.oneHandredAndFifteen;

import java.util.HashSet;
import java.util.Set;


public class CollectionDemoOne {

	public static void main(String[] args) {
		Set<String> all = new HashSet<String>();
		System.out.println("集合是否为空：" + all.isEmpty());
		all.add("Hello");
		all.add("Hello");// 重复数据
		all.add("world");
		all.add("mldn");
		System.out.println("集合是否为空：" + all.isEmpty());
		System.out.println(all);
	}

}
