package com.mldn.java.newClass.twentyTwo;

public class DemoOne {
	public static void main(String[] args) {
		Person per = new Person();
		per.eat();// �����Է�ָ������ɵݹ������ɡ�
	}
}

class Person {
	// δ�Ա��ı��
	private boolean flag = false;

	// ��100����ʳ
	private int amount = 100;

	// �Է��� ÿ����һ�γ�1��
	public void eat() {
		this.amount--;
		System.out.println("�Է�����ǰ��ʳ����" + this.amount);
		if (this.amount == 80) {
			this.flag = true;
		}
		if (flag || this.amount == 0) {
			return;// ������
			// �ݹ���ã���������ʳ
		}
		this.eat();
	}
}