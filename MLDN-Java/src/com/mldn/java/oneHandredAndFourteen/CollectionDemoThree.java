package com.mldn.java.oneHandredAndFourteen;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemoThree {

	public static void main(String[] args) {
		Collection<String> all = new ArrayList<String>();
		System.out.println("�����Ƿ�Ϊ�գ�" + all.isEmpty());
		all.add("Hello");
		all.add("Hello");// �ظ�����
		all.add("World");
		all.add("mldn");
		System.out.println("�����Ƿ�Ϊ�գ�" + all.isEmpty());
		System.out.println(all);
		System.out.println("=========");
		String[] str = all.toArray(new String[] {});// ת��ΪString����
		for (int x = 0; x < str.length; x++) {
			System.out.println(str[x]);
		}
	}

}
