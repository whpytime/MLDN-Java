package com.mldn.java.newClass.thirteen;

public class thisDemoFour {

	public static void main(String[] args) {
		Emp e1 = new Emp();
		Emp e2 = new Emp(1001);
		Emp e3 = new Emp(1002, "����", "����");
		Emp e4 = new Emp(1003, "����", "����", 2000.0);
		System.out.println(e1.getInfo());
		System.out.println(e2.getInfo());
		System.out.println(e3.getInfo());
		System.out.println(e4.getInfo());
	}
}

class Emp{
	private int empno;
	private String ename;
	private String dname;
	private double sal;
	
	public Emp(){
		this(1000, "������", "δ��", 0.0);
	}
	
	public Emp(int empno){
		this(empno, "������", "����", 1000.0);
	}
	
	public Emp(int empno, String ename, String dname){
		this(empno, ename, dname, 1000.0);
	}
	
	public Emp(int empno, String ename, String dname, double sal){
		this.empno = empno;
		this.ename = ename;
		this.dname = dname;
		this.sal = sal;
	}
	
	public String getInfo(){
		return "��ţ�" + this.empno + "��������" + this.ename 
				+ "�����ţ�" + this.dname + "�����ʣ�" + this.sal;
	}
}
