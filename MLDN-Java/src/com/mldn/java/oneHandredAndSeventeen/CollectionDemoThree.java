package com.mldn.java.oneHandredAndSeventeen;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionDemoThree {

	public static void main(String[] args) {
		Map<Integer, String> map = new Hashtable<Integer, String>();
		map.put(1, "����");
		map.put(1, "����");
		map.put(2, "����");
		map.put(3, "����");
		Set<Integer> set = map.keySet();// ȡ��ȫ����key
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			Integer key = iter.next();
			System.out.println(key + " --> " + map.get(key));
		}
	}

}
