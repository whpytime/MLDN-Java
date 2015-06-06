package com.mldn.java.newClass.eighteen;

public class DemoSix {
	public static void main(String[] args){
		new Person6();
		new Person6();
		new Person6();
	}
}

class Person6{
	private static int count = 0;
	
	public Person6(){
		System.out.println("实例化对象个数：" + ++count);
	}
}