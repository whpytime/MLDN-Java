package com.mldn.java.newClass.fourteen;

public class DemoOne {
	public static void main(String[] args) {
		MyResult1 mr = new MyResult1();
		mr.setNum(100);
		fun(mr);
		System.out.println(mr.getNum());
	}
	
	public static void fun(MyResult1 temp){
		temp.setNum(30);
	}
}

class MyResult1{
	private int num = 10;

	public void setNum(int n){
		this.num = n;
	}
	
	public int getNum(){
		return this.num;
	}
}