package com.mldn.java.newClass.twoAndThree;

public class TestDemo6 {

	public static void main(String[] args) {
		String str = "Hello"; // ˫��������
		str = str + " World"; // ��+����ʾ�ַ�������
		str += "!!!"; // ��ʾ�ַ�������
		System.out.println(str); // Hello World!!!

		int numA = 10;
		double numB = 20.1;
		String strA = "����Ľ���ǣ�" + numA + numB;// numA��numB�Զ�ת��ΪString����
		System.out.println(strA); // ����Ľ���ǣ�1020.1

		String strB = "����Ľ���ǣ�" + (numA + numB);
		System.out.println(strB);// ����Ľ���ǣ�30.1
	}
}
