package com.mldn.java.oneHandredAndSixteen;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemoTwo {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		all.add("Hello");
		all.add("Hello");// �ظ�����
		all.add("world");
		all.add("mldn");
		ListIterator<String> iter = all.listIterator();
		System.out.println("��ǰ��������");
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		System.out.println("�ɺ���ǰ�����");
		while (iter.hasPrevious()) {
			String str = iter.previous();
			System.out.println(str);
		}
	}

}
