package com.mldn.java.oneHandredAndEighteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemoOne {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		Collections.addAll(all, "A", "B", "C", "D", "E");
		Collections.reverse(all);
		System.out.println(all);
	}

}
