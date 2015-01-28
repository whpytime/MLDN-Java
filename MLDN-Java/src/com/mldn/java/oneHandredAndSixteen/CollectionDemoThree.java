package com.mldn.java.oneHandredAndSixteen;

import java.util.Enumeration;
import java.util.Vector;

public class CollectionDemoThree {

	public static void main(String[] args) {
		Vector<String> all = new Vector<String>();
		all.add("Hello");
		all.add("Hello");
		all.add("world");
		all.add("MLDN");
		Enumeration<String> enu = all.elements();
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
	}

}
