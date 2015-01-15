package com.mldn.java.ninetyTwo;

interface Fruit {
	public void eat();
}

class Apple implements Fruit {

	@Override
	public void eat() {
		System.out.println("*****³ÔÆ»¹û");
	}

}

class Factory {
	public static Fruit getFruit(String className) {
		Fruit instance = null;
		try {
			Class<?> cls = Class.forName(className);
			instance = (Fruit) cls.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return instance;
	}
}

public class APIDemoFive {

	public static void main(String[] args) {
		Fruit f = Factory.getFruit("com.mldn.java.NinetyTwo.Apple");
		f.eat();
	}
}
