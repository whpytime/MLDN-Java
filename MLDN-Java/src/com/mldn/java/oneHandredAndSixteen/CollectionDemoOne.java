package com.mldn.java.oneHandredAndSixteen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemoOne {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		all.add("Hello");
		all.add("Hello");// ÖØ¸´Êý¾Ý
		all.add("world");
		all.add("mldn");
		Iterator<String> iter = all.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
	}

}
