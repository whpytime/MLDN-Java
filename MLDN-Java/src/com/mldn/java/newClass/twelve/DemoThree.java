package com.mldn.java.newClass.twelve;

public class DemoThree {

	public static void main(String[] args) {
		Outer3.Inner3 in = new Outer3().new Inner3();
	}

}

class Outer3{
	public Outer3(){
		System.out.println("Outer3�Ĺ��췽��");
	}
	
	class Inner3{
		public Inner3(){
			System.out.println("Inner3�Ĺ��췽��");
		}
	}
}