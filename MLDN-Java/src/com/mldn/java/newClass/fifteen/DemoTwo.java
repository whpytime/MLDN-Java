package com.mldn.java.newClass.fifteen;

public class DemoTwo {
	public static void main(String args[])
	{
		Emp2 e1 = new Emp2(7369, "张三", "销售", 1000.0, 500.0) ;
		Emp2 e2 = new Emp2(7780, "李四", "经理", 2000.0, 1000.0) ;
		Emp2 e3 = new Emp2(7781, "王五", "售后", 2000.0, 1000.0) ;
		Dept2 d1 = new Dept2(10, "销售部", "北京") ;
		Dept2 d2 = new Dept2(20, "产品部", "哈尔滨") ;
		e1.setDept(d1) ;
		e1.setMgr(e2) ;
		e2.setDept(d1) ;
		e2.setMgr(e3) ;
		e3.setDept(d2) ;
		d1.setEmp(e1) ;
		d1.setEmp(e2) ;
		d2.setEmp(e3) ;
		
		System.out.println(e1.getEmpInfo()) ;
		System.out.println(d1.getDeptInfo()) ;
		System.out.println(d1.getDeptMemberNum()) ;
		System.out.println(d1.getDeptEmpInfo()) ;
	}
}

class Emp2
{
	private int empno ;
	private String ename ;
	private String job ;
	private double sal ;
	private double comm ;
	private Dept2 dept ;		//每个雇员有一个部门
	private Emp2 mgr ;		//每个雇员有一个领导
	
	public Emp2(int empno, String ename, String job, double sal, double comm)
	{
		this.empno = empno ;
		this.ename = ename ;
		this.job = job ;
		this.sal = sal ;
		this.comm = comm ;
	}
	
	public void setDept(Dept2 dept)
	{
		this.dept = dept ;
	}
	
	public Dept2 getDept()
	{
		return this.dept ;
	}
	
	public void setMgr(Emp2 mgr)
	{
		this.mgr = mgr ;
	}
	
	public Emp2 getMgr()
	{
		return this.mgr ;
	}
	
	public String getEmpInfo()
	{
		return "雇员信息：" + "\n" +
				"\t|- 编号：" + this.empno + "\n" +
				"\t|- 姓名：" + this.ename + "\n" +
				"\t|- 职位：" + this.job + "\n" +
				"\t|- 工资：" + this.sal + "\n" +
				"\t|- 奖金：" + this.comm + "\n" +
				"\t|- 部门编号：" + this.dept.getDeptno() + "\n" +
				"\t|- 领导：" + this.mgr.empno ;
	}
}


class Dept2
{
	private int deptno ;
	private String dname ;
	private String loc ;
	private Emp2[] emps ;		//每个部门有多个雇员
	
	public Dept2(int deptno, String dname, String loc)
	{
		this.deptno = deptno ;
		this.dname = dname ;
		this.loc = loc ;
	}
	
	public void setEmp(Emp2 emp)
	{
		if(this.emps == null)
		{
			this.emps = new Emp2[] {emp} ;
		}
		else
		{
			Emp2[] temp = new Emp2[this.emps.length + 1] ;
			System.arraycopy(this.emps, 0, temp, 0, this.emps.length) ;
			temp[this.emps.length] = emp ;
			this.emps = temp ;
		}
	}
	
	public Emp2[] getEmps()
	{
		return this.emps ;
	}
	
	public String getDeptInfo()
	{
		return "部门信息：" + "\n" +
				"\t|- 部门编号：" + this.deptno + "\n" +
				"\t|- 部门名称：" + this.dname + "\n" +
				"\t|- 部门位置：" + this.loc ;
	}
	
	public String getDeptMemberNum()
	{
		return this.dname + "部门有员工" + this.emps.length + "人";
	}
	
	public String getDeptEmpInfo()
	{
		String temp = "" ;
		for(int x = 0; x < this.emps.length; x ++)
		{
			temp = temp + this.emps[x].getEmpInfo() + "\n";
		}
		return temp ;
	}
	
	public int getDeptno()
	{
		return this.deptno ;
	}

}