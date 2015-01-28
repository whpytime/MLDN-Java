package com.mldn.java.oneHandredAndFourteen;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemoOne {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		System.out.println("集合是否为空：" + all.isEmpty());
		all.add("Hello");
		all.add("Hello");// 重复数据
		all.add("world");
		all.add("mldn");
		System.out.println("集合是否为空：" + all.isEmpty());
		System.out.println(all);
		System.out.println("=============");
		for (int x = 0; x < all.size(); x++) {
			System.out.println(all.get(x));// 取得x位置的内容
		}
	}

}
