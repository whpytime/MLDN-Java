package com.mldn.java.newClass.nine;

public class TestJava {

	public static void main(String[] args) {
		Emp emp1 = new Emp(1001, "张三", "清扫员", 1000, 100);
		Emp emp2 = new Emp();
		System.out.println(emp1.getInfo());
		System.out.println(emp2.getInfo());
	}
}

class Emp {
	private int empno;
	private String name;
	private String job;
	private int sal;
	private int comm;

	public Emp() {

	}

	public Emp(int empno, String name, String job, int sal, int comm) {
		this.setEmpno(empno);
		this.setName(name);
		this.setJob(job);
		this.setSal(sal);
		this.setComm(comm);
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		if (sal > 0) {
			this.sal = sal;
		}
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		if (comm > 0) {
			this.comm = comm;
		}
	}

	public String getInfo() {
		return "雇员编号：" + this.getEmpno() + "，\t姓名：" + this.getName() + "，\t职位：" 
				+ this.getJob() + "，\t基本工资：" + this.getSal() + "，\t奖金：" + this.getComm();
	}
}