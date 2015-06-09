package com.mldn.java.newClass.twentyThree;

public class DemoOne {
	public static void main(String[] args) {
		// 第一层：设置关系
		Dept dept = new Dept(10, "ACCOUNTING", "New York");
		Emp ea = new Emp(7369, "SMITH", "CLERK", 800.0, 0.0);
		Emp eb = new Emp(7903, "FORD", "MANAGER", 2450.0, 0.0);
		Emp ec = new Emp(7839, "KING", "PRESIDENT", 5000.0, 0.0);
		ea.setMgr(eb);
		eb.setMgr(ec);
		dept.getEmps().add(ea);
		dept.getEmps().add(eb);
		dept.getEmps().add(ec);
		ea.setDept(dept);
		eb.setDept(dept);
		ec.setDept(dept);
		// 第二层：输出关系
		System.out.println(dept.getInfo() + "，员工数量：" + dept.getEmps().size());
		Emp[] emp = dept.getEmps().toArray();
		for (int x = 0; x < emp.length; x++) {
			if (emp[x].getMgr() != null) {
				System.out.println("\t| - " + emp[x].getInfo());
				System.out.println("\t\t| - " + emp[x].getMgr().getInfo2());
			} else {
				System.out.println("\t| - " + emp[x].getInfo2());
			}
			// System.out.println("\t\t| - " + emp[x].getMgr().getInfo());
			// if (emp[x].getMgr() != null) {
			// System.out.println("\t| - " + emp[x].getInfo2());
			// }
		}
	}
}

class Dept {// 需要提供对象比较方法
	private int deptno;
	private String dname;
	private String loc;
	private Link emps;// 保存多个雇员

	public Dept() {
		this.emps = new Link();
	}

	public Dept(int deptno, String dname, String loc) {
		this();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public Link getEmps() {
		return this.emps;
	}

	public int getDeptno() {
		return this.deptno;
	}

	public boolean compare(Dept dept) {
		if (dept == null) {
			return false;
		}
		if (this == dept) {
			return true;
		}
		if (this.deptno == dept.deptno && this.dname.equals(dept.dname)
				&& this.loc.equals(dept.loc)) {
			return true;
		}
		return false;
	}

	public String getInfo() {
		return "部门编号：" + this.deptno + "，部门名称：" + this.dname + "，地址："
				+ this.loc;
	}
}

class Emp {// 需要提供对象比较方法
	private int empno;
	private String ename;
	private String job;
	private double sal;
	private double comm;
	private Emp mgr;
	private Dept dept;

	public Emp() {

	}

	public Emp(int empno, String ename, String job, double sal, double comm) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
		this.comm = comm;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Dept getDept() {
		return this.dept;
	}

	public void setMgr(Emp mgr) {
		this.mgr = mgr;
	}

	public Emp getMgr() {
		return this.mgr;
	}

	public boolean compare(Emp emp) {
		if (emp == null) {
			return false;
		}
		if (this == emp) {
			return true;
		}
		if (this.empno == emp.empno && this.ename.equals(emp.ename)
				&& this.job.equals(emp.job) && this.sal == emp.sal
				&& this.comm == emp.comm && this.mgr.compare(emp.mgr)
				&& this.dept.compare(emp.dept)) {
			return true;
		}
		return false;
	}

	public String getInfo() {
		return "雇员编号：" + this.empno + "，雇员姓名：" + this.ename + "，雇员岗位："
				+ this.job + "，雇员工资：" + this.job + "，雇员奖金：" + this.comm
				+ "，雇员领导：" + this.mgr.empno + "，雇员部门：" + this.dept.getDeptno();
	}

	public String getInfo2() {
		return "雇员编号：" + this.empno + "，雇员姓名：" + this.ename + "，雇员岗位："
				+ this.job + "，雇员工资：" + this.job + "，雇员奖金：" + this.comm
				+ "，雇员领导：" + this.mgr + "，雇员部门：" + this.dept.getDeptno();
	}
}

// 此处的Link类是从前面第21讲中的LinkDemo2.java程序中copy来
// 讲Person全部替换为Emp
class Link {
	// Node类不需要被外部所见，定义为私有内部类
	private class Node5 {
		private Emp data;
		private Node5 next;

		public Node5(Emp data) {
			this.data = data;
		}

		public void addNode(Node5 newNode) {
			if (this.next == null) {
				this.next = newNode;
			} else {
				this.next.addNode(newNode);
			}
		}

		public Emp getNode(int index) {
			if (index == Link.this.foot++) {
				return this.data;
			} else {
				return this.next.getNode(index);
			}
		}

		public boolean containsNode(Emp keyWord) {
			if (this.data.compare(keyWord)) {
				return true;
			}
			if (this.next != null) {
				return this.next.containsNode(keyWord);
			}
			return false;
		}

		public void removeNode(Node5 previousNode, Emp keyWord) {
			if (this.data.compare(keyWord)) {
				previousNode.next = this.next;
			} else {
				if (this.next != null) {
					return;
				} else {
					this.next.removeNode(this, keyWord);
				}
			}
		}

		public Emp[] toArrayNode() {
			Link.this.retData[Link.this.foot++] = this.data;// ???
			if (this.next != null) {
				this.next.toArrayNode();
			}
			return Link.this.retData;
		}
	}

	// 根节点
	private Node5 root;

	// 统计个数
	private int count;

	// 标记索引数据
	private int foot;

	// 保存对象的数组
	private Emp[] retData;

	// 增加数据的方法，将传入的数据封装为一个Node5类对象，
	// 封装的好处：可以进行节点的排列
	// 此方法中的传入的数据必须与Node5类中data属性的类型相同
	public void add(Emp data) {
		if (data == null) {
			return;
		}
		Node5 newNode = new Node5(data);
		if (this.root == null) {
			this.root = newNode;
		} else {
			this.root.addNode(newNode);
		}
		// 增加个数
		this.count++;
	}

	// 取得链表中保存的元素的个数
	// 每当一个新数据保存之后，应该进行一个数据的修改
	// 1、由于需要针对所有的节点操作，则需要在Link类中增加count属性
	// 2、在add()方法执行完毕之后，需要增加个数
	// 3、在Link类中，增加size方法，返回链表元素个数
	public int size() {
		return this.count;
	}

	// 判断是否为空链表
	public boolean isEmpty() {
		if (this.count == 0) {
			return true;
		}
		return false;
	}

	// 清空链表
	public void clean() {
		this.root = null;
		this.count = 0;
	}

	// 取得指定索引位置的数据，没有则返回null
	// 1、在Link类中增加foot属性，用于标记索引
	// 2、增加get()方法，用于查询数据
	// 3、在Node5类中进行查询，并同时修改foot属性
	public Emp get(int index) {
		if (index >= this.count || index < 0) {
			return null;
		}
		this.foot = 0;
		return this.root.getNode(index);
	}

	// 判断指定数据是否存在
	// 1、在Link类中增加contains()方法
	// 2、判断keyWord是否为空
	// 3、在Node5类中进行查询
	public boolean contains(Emp keyWord) {
		if (keyWord.compare(null)) {
			return false;
		}
		if (this.root == null) {
			return false;
		}
		return this.root.containsNode(keyWord);
	}

	// 删除数据
	// 1、删除的数据是根节点，则link = link.next
	// 2、删除的数据不是根节点，则调用Node5中removeNode()方法
	public void remove(Emp keyWord) {
		if (this.root == null || keyWord == null) {
			return;
		}
		if (this.contains(keyWord)) {
			if (this.root.data.compare(keyWord)) {
				this.root = this.root.next;
			} else {
				// 从根节点的下一个节点开始，并传递其前一个节点的信息
				this.root.next.removeNode(this.root, keyWord);
			}
			this.count--;
		}
	}

	// 返回全部数据
	// 此对象数组所有节点都可见，因此定义在Link类内定义
	public Emp[] toArray() {
		if (this.count == 0) {
			return null;
		}
		this.foot = 0;// 设置数组索引
		this.retData = new Emp[this.count];// 数组大小由count决定
		return this.root.toArrayNode();
	}
}