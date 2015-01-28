package com.mldn.java.oneHandredAndSixteen;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemoFour {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		all.add("Hello");
		all.add("Hello");
		all.add("world");
		all.add("mldn");
		for (String str : all) {
			System.out.println(str);
		}
	}

}
