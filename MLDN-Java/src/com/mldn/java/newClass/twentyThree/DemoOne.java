package com.mldn.java.newClass.twentyThree;

public class DemoOne {
	public static void main(String[] args) {
		// ��һ�㣺���ù�ϵ
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
		// �ڶ��㣺�����ϵ
		System.out.println(dept.getInfo() + "��Ա��������" + dept.getEmps().size());
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

class Dept {// ��Ҫ�ṩ����ȽϷ���
	private int deptno;
	private String dname;
	private String loc;
	private Link emps;// ��������Ա

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
		return "���ű�ţ�" + this.deptno + "���������ƣ�" + this.dname + "����ַ��"
				+ this.loc;
	}
}

class Emp {// ��Ҫ�ṩ����ȽϷ���
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
		return "��Ա��ţ�" + this.empno + "����Ա������" + this.ename + "����Ա��λ��"
				+ this.job + "����Ա���ʣ�" + this.job + "����Ա����" + this.comm
				+ "����Ա�쵼��" + this.mgr.empno + "����Ա���ţ�" + this.dept.getDeptno();
	}

	public String getInfo2() {
		return "��Ա��ţ�" + this.empno + "����Ա������" + this.ename + "����Ա��λ��"
				+ this.job + "����Ա���ʣ�" + this.job + "����Ա����" + this.comm
				+ "����Ա�쵼��" + this.mgr + "����Ա���ţ�" + this.dept.getDeptno();
	}
}

// �˴���Link���Ǵ�ǰ���21���е�LinkDemo2.java������copy��
// ��Personȫ���滻ΪEmp
class Link {
	// Node�಻��Ҫ���ⲿ����������Ϊ˽���ڲ���
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

	// ���ڵ�
	private Node5 root;

	// ͳ�Ƹ���
	private int count;

	// �����������
	private int foot;

	// ������������
	private Emp[] retData;

	// �������ݵķ���������������ݷ�װΪһ��Node5�����
	// ��װ�ĺô������Խ��нڵ������
	// �˷����еĴ�������ݱ�����Node5����data���Ե�������ͬ
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
		// ���Ӹ���
		this.count++;
	}

	// ȡ�������б����Ԫ�صĸ���
	// ÿ��һ�������ݱ���֮��Ӧ�ý���һ�����ݵ��޸�
	// 1��������Ҫ������еĽڵ����������Ҫ��Link��������count����
	// 2����add()����ִ�����֮����Ҫ���Ӹ���
	// 3����Link���У�����size��������������Ԫ�ظ���
	public int size() {
		return this.count;
	}

	// �ж��Ƿ�Ϊ������
	public boolean isEmpty() {
		if (this.count == 0) {
			return true;
		}
		return false;
	}

	// �������
	public void clean() {
		this.root = null;
		this.count = 0;
	}

	// ȡ��ָ������λ�õ����ݣ�û���򷵻�null
	// 1����Link��������foot���ԣ����ڱ������
	// 2������get()���������ڲ�ѯ����
	// 3����Node5���н��в�ѯ����ͬʱ�޸�foot����
	public Emp get(int index) {
		if (index >= this.count || index < 0) {
			return null;
		}
		this.foot = 0;
		return this.root.getNode(index);
	}

	// �ж�ָ�������Ƿ����
	// 1����Link��������contains()����
	// 2���ж�keyWord�Ƿ�Ϊ��
	// 3����Node5���н��в�ѯ
	public boolean contains(Emp keyWord) {
		if (keyWord.compare(null)) {
			return false;
		}
		if (this.root == null) {
			return false;
		}
		return this.root.containsNode(keyWord);
	}

	// ɾ������
	// 1��ɾ���������Ǹ��ڵ㣬��link = link.next
	// 2��ɾ�������ݲ��Ǹ��ڵ㣬�����Node5��removeNode()����
	public void remove(Emp keyWord) {
		if (this.root == null || keyWord == null) {
			return;
		}
		if (this.contains(keyWord)) {
			if (this.root.data.compare(keyWord)) {
				this.root = this.root.next;
			} else {
				// �Ӹ��ڵ����һ���ڵ㿪ʼ����������ǰһ���ڵ����Ϣ
				this.root.next.removeNode(this.root, keyWord);
			}
			this.count--;
		}
	}

	// ����ȫ������
	// �˶����������нڵ㶼�ɼ�����˶�����Link���ڶ���
	public Emp[] toArray() {
		if (this.count == 0) {
			return null;
		}
		this.foot = 0;// ������������
		this.retData = new Emp[this.count];// �����С��count����
		return this.root.toArrayNode();
	}
}