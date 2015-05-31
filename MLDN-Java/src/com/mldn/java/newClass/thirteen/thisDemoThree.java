package com.mldn.java.newClass.thirteen;

public class thisDemoThree {

	public static void main(String[] args) {
		A a = new A() ;				//1、调用构造方法
		System.out.println(a) ;
	}
}

class A{
	private B var ;
	
	public A(){						//2、执行构造方法，使this = a
		this.var = new B(this) ;	//3、实例化B类对象var，this = a 
		this.var.get() ;			//6、调用B类对象var的get方法
	}
	
	public void print(){				//9、执行方法
		System.out.println(this) ;	//10、执行语句，其中this = a
	}
}

class B{
	private A temp ;
	
	public B(A temp){				//4、执行构造方法，A:temp = a
		this.temp = temp ;			//5、将外部的a实例赋值给B类的temp属性，B:temp = a
	}
	
	public void get(){				//7、执行方法
		this.temp.print() ;			//8、执行语句，其中this = var，temp = a
	}
}