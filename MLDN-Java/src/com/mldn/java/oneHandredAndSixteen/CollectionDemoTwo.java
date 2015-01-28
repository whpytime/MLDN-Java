package com.mldn.java.oneHandredAndSixteen;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemoTwo {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		all.add("Hello");
		all.add("Hello");// 重复数据
		all.add("world");
		all.add("mldn");
		ListIterator<String> iter = all.listIterator();
		System.out.println("由前向后输出：");
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		System.out.println("由后向前输出：");
		while (iter.hasPrevious()) {
			String str = iter.previous();
			System.out.println(str);
		}
	}

}
