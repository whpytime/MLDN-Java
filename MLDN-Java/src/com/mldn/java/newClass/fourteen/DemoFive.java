package com.mldn.java.newClass.fourteen;

public class DemoFive {
	public static void main(String[] args) {
		MyResult mr = new MyResult();
		mr.setMsg("World");
		fun(mr);
		System.out.println(mr.getMsg());
	}
	
	public static void fun(MyResult temp){
		temp.setMsg("Hello");
	}
}

class MyResult{
	private String msg = "h";
	
	public void setMsg(String m){
		this.msg = m;
	}
	
	public String getMsg(){
		return this.msg;
	}
}