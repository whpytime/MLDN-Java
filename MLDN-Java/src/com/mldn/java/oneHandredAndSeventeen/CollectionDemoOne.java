package com.mldn.java.oneHandredAndSeventeen;

import java.util.HashMap;
import java.util.Map;

public class CollectionDemoOne {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "����");
		map.put(null, null);// ����null
		map.put(1, "����");// key�ظ������µ����ݸ��Ǿɵ�����
		map.put(2, "����");// value�ظ�
		map.put(3, "����");// ���ظ�
		System.out.println(map);
		System.out.println(map.get(1));
		System.out.println(map.get(10));// key������
	}

}
