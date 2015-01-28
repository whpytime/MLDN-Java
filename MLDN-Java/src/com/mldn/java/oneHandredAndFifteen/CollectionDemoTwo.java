package com.mldn.java.oneHandredAndFifteen;

import java.util.Set;
import java.util.TreeSet;


public class CollectionDemoTwo {

	public static void main(String[] args) {
		Set<String> all = new TreeSet<String>();
		System.out.println("集合是否为空：" + all.isEmpty());
		all.add("B");
		all.add("C");// 重复数据
		all.add("A");
		all.add("A");
		System.out.println("集合是否为空：" + all.isEmpty());
		System.out.println(all);
	}

}
