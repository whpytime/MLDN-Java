package com.mldn.java.ninetyTwo;

class Person6 {

	@Override
	public String toString() {
		return "Person���һ������";
	}

}

public class APIDemoFour {

	public static void main(String[] args) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		Person6 per = new Person6(); // ��������
		System.out.println(per);

		Class<?> cls = Class.forName("com.mldn.java.NinetyTwo.Person");
		Person per1 = (Person) cls.newInstance(); // ʹ�÷���ʵ��������
		System.out.println(per1);
	}

}
