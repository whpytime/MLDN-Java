package com.mldn.java.oneHandredAndFourteen;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemoTwo {

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
		Object[] obj = all.toArray();// ת��Ϊ��������
		for (int x = 0; x < obj.length; x++) {
			String str = (String) obj[x];// ����ת�ͣ����ڰ�ȫ����
			System.out.println(str);
		}
	}

}
