package com.mldn.java.newClass.fifteen;

public class DemoOne {
	public static void main(String[] args) {

	}
}

class Emp{
	private int empno;
	private String ename;
	private String job;
	private double sal;
	private double comm;
	private Emp mgr;
	private Dept dept;
	
	public Emp(int empno, String ename, String job, double sal, double comm, Emp mgr, Dept dept){
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
		this.comm = comm;
		this.mgr = mgr;
		this.dept = dept;
	}
	
	public String getInfo(){
		return "编号：" + this.empno + "，姓名：" + this.ename + "，职位：" + this.job 
				+ "，工资：" + this.sal + "，奖金：" + this.comm ;				
	}
	
	public String getMgrInfo(){
		return "领导编号：" + this.mgr.empno + "，领导姓名：" + this.mgr.ename + "，领导职位：" + this.mgr.job 
				+ "，领导工资：" + this.mgr.sal + "，领导奖金：" + this.mgr.comm 
				+ "，领导所在部门信息：\n" + this.mgr.dept.getInfo();
	}
}

class Dept{
	private int deptno;
	private String dname;
	private String loc;
	private Emp[] emps;
	
	public Dept(int deptno, String dname, String loc){
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	public void addEmp(Emp emp){
		Emp[] temp = new Emp[this.emps.length + 1];
		System.arraycopy(emps, 0, temp, 0, emps.length);
		temp[emps.length] = emp;
		emps = temp;
	}
	
	public String getDname(){
		return this.dname;
	}
	
	public String getInfo(){
		return "部门编号：" + this.deptno + "，部门名称：" + this.dname + "，部门位置：" + this.loc;
	}
	
	public Emp[] getEmps(){
		return emps;
	}
}