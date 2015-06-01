package com.mldn.java.newClass.fifteen;

public class DemoOne {
	public static void main(String[] args) {

	}
}

class Emp {
	private int empno;
	private String ename;
	private String job;
	private double sal;
	private double comm;
	private Emp mgr;
	private Dept dept;

	public Emp(int empno, String ename, String job, double sal, double comm, Emp mgr, Dept dept) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
		this.comm = comm;
		this.mgr = mgr;
		this.dept = dept;
	}

	public String getInfo() {
		return "��ţ�" + this.empno + "��������" + this.ename + "��ְλ��" + this.job + "�����ʣ�" + this.sal + "������" + this.comm;
	}

	public Emp getMgr() {
		return this.mgr;
	}
}

class Dept {
	private int deptno;
	private String dname;
	private String loc;
	private Emp[] emps;

	public Dept(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public void addEmp(Emp emp) {
		if (this.emps == null) {
			this.emps = new Emp[] { emp };
		} else {
			Emp[] temp = new Emp[this.emps.length + 1];
			System.arraycopy(emps, 0, temp, 0, emps.length);
			temp[emps.length] = emp;
			emps = temp;
		}
	}

	public String getDname() {
		return this.dname;
	}

	public String getInfo() {
		return "���ű�ţ�" + this.deptno + "���������ƣ�" + this.dname + "������λ�ã�" + this.loc;
	}

	public Emp[] getEmps() {
		return emps;
	}
}