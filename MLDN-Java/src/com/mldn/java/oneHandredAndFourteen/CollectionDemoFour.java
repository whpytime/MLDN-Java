package com.mldn.java.oneHandredAndFourteen;

import java.util.List;
import java.util.Vector;

public class CollectionDemoFour {

	public static void main(String[] args) {
		List<String> all = new Vector<String>();
		System.out.println("�����Ƿ�Ϊ�գ�" + all.isEmpty());
		all.add("Hello");
		all.add("Hello");// �ظ�����
		all.add("world");
		all.add("mldn");
		System.out.println("�����Ƿ�Ϊ�գ�" + all.isEmpty());
		System.out.println(all);
		System.out.println("=============");
		for (int x = 0; x < all.size(); x++) {
			System.out.println(all.get(x));// ȡ��xλ�õ�����
		}
	}

}
