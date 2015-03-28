package com.mldn.java.newClass.twoAndThree;

public class TestDemo {

	public static void main(String[] args) {
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println(max);
		System.out.println(min);
		System.out.println("1===========");
		
		System.out.println(max + 1);
		System.out.println(min - 1);
		System.out.println("2===========");
		
		System.out.println(max + 1L);
		System.out.println(max + (long)2);
		System.out.println("3===========");
		
		System.out.println(min - 1L);
		System.out.println(min - (long)2);
	}

}
