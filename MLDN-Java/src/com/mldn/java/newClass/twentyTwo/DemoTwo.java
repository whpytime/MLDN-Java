package com.mldn.java.newClass.twentyTwo;

public class DemoTwo {
	public static void main(String[] args) {
		Person2 per = new Person2("Сл��");
		Person2 temp = per; // ���ô���
		temp.setName("С����");// �޸�����
		System.out.println(per.getName());
		fun(per);
		System.out.println(per.getName());
	}

	// static������������������ֱ�ӵ���
	// static��������������û��ʵ������ʱ�����
	// static����ֻ�ܷ���static���Ի�static����
	// ���������������ֻ�ܷ���static����
	public static void fun(Person2 temp) {
		temp.setName("С����");
	}
}

// �ࣺĳЩ���Ե����ݼ��ϣ���֮�ж����˶����������Ϊ
// ��ֻ�������������ʹ�ã��������������ͣ���Ҫ�����ڴ�ռ�
// ÿһ������֮�У�Ҫ�����Լ���������Ϣ
class Person2 {
	// String��һ���������
	// ""��������һ��String�����
	// String��ķ���Ҫ���
	// �κε����Զ�������з�װ����װ������Ա����дsetter��getter
	private String name;

	// ���췽����������������ͬ�����޷���ֵ����
	// ���췽��ʵ��ʹ�ùؼ���new��ʱ����ã���ֻ����һ��
	// ���췽��֮��ʹ��this�໥���ã�������Ҫ����һ������
	// ���췽������ҪĿ�ģ�Ϊ���е����Գ�ʼ��
	public Person2(String name) {
		// ֻҪ�����ڲ����ʱ�������ԣ�����ǰ���this
		this.name = name;
	}

	// setter�������ԣ��������ݣ��޸�����
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}