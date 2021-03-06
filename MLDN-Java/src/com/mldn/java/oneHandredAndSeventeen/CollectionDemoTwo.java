package com.mldn.java.oneHandredAndSeventeen;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionDemoTwo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "张三");
		map.put(1, "李四");
		map.put(null, null);
		map.put(2, "王五");
		map.put(3, "赵六");
		Set<Integer> set = map.keySet();// 取得全部的key
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			Integer key = iter.next();
			System.out.println(key + " --> " + map.get(key));
		}
	}

}
