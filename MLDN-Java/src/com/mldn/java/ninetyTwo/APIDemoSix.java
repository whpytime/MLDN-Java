package com.mldn.java.ninetyTwo;

interface Fruit3 {

}

class Person implements Fruit3, Cloneable {

}

public class APIDemoSix {

	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("com.mldn.java.ninetyTwo.Person");
		System.out.println("父类：" + cls.getSuperclass().getName());

		Class<?>[] it = cls.getInterfaces(); // 取得全部接口
		for (int x = 0; x < it.length; x++) {
			System.out.println(it[x].getName());
		}
	}

}
