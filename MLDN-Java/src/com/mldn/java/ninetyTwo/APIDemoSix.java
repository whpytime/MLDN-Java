package com.mldn.java.ninetyTwo;

interface Fruit1 {

}

class Persona implements Fruit1, Cloneable {

}

public class APIDemoSix {

	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("com.mldn.java.ninetyTwo.Persona");
		System.out.println("���ࣺ" + cls.getSuperclass().getName());

		Class<?>[] it = cls.getInterfaces(); // ȡ��ȫ���ӿ�
		for (int x = 0; x < it.length; x++) {
			System.out.println(it[x].getName());
		}
	}
 
}
