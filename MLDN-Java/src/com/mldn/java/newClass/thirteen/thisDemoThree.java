package com.mldn.java.newClass.thirteen;

public class thisDemoThree {

	public static void main(String[] args) {
		A a = new A() ;				//1�����ù��췽��
		System.out.println(a) ;
	}
}

class A{
	private B var ;
	
	public A(){						//2��ִ�й��췽����ʹthis = a
		this.var = new B(this) ;	//3��ʵ����B�����var��this = a 
		this.var.get() ;			//6������B�����var��get����
	}
	
	public void print(){				//9��ִ�з���
		System.out.println(this) ;	//10��ִ����䣬����this = a
	}
}

class B{
	private A temp ;
	
	public B(A temp){				//4��ִ�й��췽����A:temp = a
		this.temp = temp ;			//5�����ⲿ��aʵ����ֵ��B���temp���ԣ�B:temp = a
	}
	
	public void get(){				//7��ִ�з���
		this.temp.print() ;			//8��ִ����䣬����this = var��temp = a
	}
}