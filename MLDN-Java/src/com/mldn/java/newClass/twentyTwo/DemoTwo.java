package com.mldn.java.newClass.twentyTwo;

public class DemoTwo {
	public static void main(String[] args) {
		Person2 per = new Person2("小谢子");
		Person2 temp = per; // 引用传递
		temp.setName("小金子");// 修改属性
		System.out.println(per.getName());
		fun(per);
		System.out.println(per.getName());
	}

	// static方法，可以由类名称直接调用
	// static方法，可以在类没有实例化的时候调用
	// static方法只能访问static属性或static方法
	// 因此主类中主函数只能访问static方法
	public static void fun(Person2 temp) {
		temp.setName("小安子");
	}
}

// 类：某些共性的数据集合，类之中定义了对象的所有行为
// 类只能依靠对象才能使用，类属于引用类型，需要分配内存空间
// 每一个对象之中，要保存自己的属性信息
class Person2 {
	// String是一个特殊的类
	// ""声明的是一个String类对象
	// String类的方法要熟记
	// 任何的属性都必须进行封装，封装后的属性必须编写setter和getter
	private String name;

	// 构造方法名称与类名称相同，且无返回值声明
	// 构造方法实在使用关键字new的时候调用，且只调用一次
	// 构造方法之间使用this相互调用，但至少要保留一个出口
	// 构造方法的主要目的：为类中的属性初始化
	public Person2(String name) {
		// 只要在类内部访问本类的属性，都在前面加this
		this.name = name;
	}

	// setter方法可以：设置内容，修改内容
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}