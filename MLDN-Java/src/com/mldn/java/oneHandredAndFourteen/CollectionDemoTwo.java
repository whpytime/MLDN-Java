package com.mldn.java.oneHandredAndFourteen;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemoTwo {

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
		Object[] obj = all.toArray();// 转换为对象数组
		for (int x = 0; x < obj.length; x++) {
			String str = (String) obj[x];// 向下转型，存在安全隐患
			System.out.println(str);
		}
	}

}
