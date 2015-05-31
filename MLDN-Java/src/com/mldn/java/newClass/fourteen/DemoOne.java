package com.mldn.java.newClass.fourteen;

public class DemoOne {
	public static void main(String[] args) {
		MyResult mr = new MyResult();
		mr.setNum(100);
		fun(mr);
		System.out.println(mr.getNum());
	}
	
	public static void fun(MyResult temp){
		temp.setNum(30);
	}
}

class MyResult{
	private int num = 10;

	public void setNum(int n){
		this.num = n;
	}
	
	public int getNum(){
		return this.num;
	}
}