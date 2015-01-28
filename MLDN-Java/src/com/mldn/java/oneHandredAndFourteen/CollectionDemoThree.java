package com.mldn.java.oneHandredAndFourteen;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemoThree {

	public static void main(String[] args) {
		Collection<String> all = new ArrayList<String>();
		System.out.println("集合是否为空：" + all.isEmpty());
		all.add("Hello");
		all.add("Hello");// 重复数据
		all.add("World");
		all.add("mldn");
		System.out.println("集合是否为空：" + all.isEmpty());
		System.out.println(all);
		System.out.println("=========");
		String[] str = all.toArray(new String[] {});// 转换为String数组
		for (int x = 0; x < str.length; x++) {
			System.out.println(str[x]);
		}
	}

}
