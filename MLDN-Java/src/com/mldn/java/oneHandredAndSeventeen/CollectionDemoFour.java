package com.mldn.java.oneHandredAndSeventeen;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionDemoFour {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "张三");
		map.put(1, "李四");
		map.put(2, "王五");
		map.put(3, null);
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		Iterator<Map.Entry<Integer, String>> iter = set.iterator();
		while (iter.hasNext()) {
			Map.Entry<Integer, String> me = iter.next();
			System.out.println(me.getKey() + " ---> " + me.getValue());
		}
	}

}
