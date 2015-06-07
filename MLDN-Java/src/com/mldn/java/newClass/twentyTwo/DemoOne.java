package com.mldn.java.newClass.twentyTwo;

public class DemoOne {
	public static void main(String[] args) {
		Person per = new Person();
		per.eat();// 发出吃饭指令，后面由递归操作完成。
	}
}

class Person {
	// 未吃饱的标记
	private boolean flag = false;

	// 有100斤粮食
	private int amount = 100;

	// 吃饭， 每调用一次吃1斤
	public void eat() {
		this.amount--;
		System.out.println("吃饭。当前粮食量：" + this.amount);
		if (this.amount == 80) {
			this.flag = true;
		}
		if (flag || this.amount == 0) {
			return;// 不吃了
			// 递归调用，继续吃粮食
		}
		this.eat();
	}
}