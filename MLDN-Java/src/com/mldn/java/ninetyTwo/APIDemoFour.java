package com.mldn.java.ninetyTwo;

class Person4 {

	@Override
	public String toString() {
		return "Person���һ������";
	}

}

public class APIDemoFour {

	public static void main(String[] args) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		Person4 per = new Person4(); // ��������
		System.out.println(per);

		Class<?> cls = Class.forName("com.mldn.java.NinetyTwo.Person");
		Person per1 = (Person) cls.newInstance(); // ʹ�÷���ʵ��������
		System.out.println(per1);
	}

}



