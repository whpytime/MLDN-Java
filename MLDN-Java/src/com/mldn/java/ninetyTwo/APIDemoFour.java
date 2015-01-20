package com.mldn.java.ninetyTwo;

class Person6 {

	@Override
	public String toString() {
		return "Person类的一个对象";
	}

}

public class APIDemoFour {

	public static void main(String[] args) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		Person6 per = new Person6(); // 正常操作
		System.out.println(per);

		Class<?> cls = Class.forName("com.mldn.java.NinetyTwo.Person");
		Person per1 = (Person) cls.newInstance(); // 使用反射实例化对象
		System.out.println(per1);
	}

}
