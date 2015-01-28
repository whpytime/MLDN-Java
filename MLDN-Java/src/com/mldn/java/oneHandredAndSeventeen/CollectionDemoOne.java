package com.mldn.java.oneHandredAndSeventeen;

import java.util.HashMap;
import java.util.Map;

public class CollectionDemoOne {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "张三");
		map.put(null, null);// 设置null
		map.put(1, "李四");// key重复，用新的内容覆盖旧的内容
		map.put(2, "张三");// value重复
		map.put(3, "王五");// 不重复
		System.out.println(map);
		System.out.println(map.get(1));
		System.out.println(map.get(10));// key不存在
	}

}
