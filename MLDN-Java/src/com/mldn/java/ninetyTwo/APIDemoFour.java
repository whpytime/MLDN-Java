package com.mldn.java.ninetyTwo;

class Person {

	@Override
	public String toString() {
		return "Person���һ������";
	}

}

public class APIDemoFour {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person per = new Person(); // ��������
		System.out.println(per);

		Class<?> cls = Class.forName("com.mldn.java.NinetyTwo.Person");
		Person per1 = (Person) cls.newInstance(); // ʹ�÷���ʵ��������
		System.out.println(per1);
	}

}
