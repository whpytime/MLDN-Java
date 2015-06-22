package com.mldn.java.newClass.twentyThree;

public class DemoTwo {

	public static void main(String[] args) {
		// ��һ�㣺���ù�ϵ
		// 1���������Ա����
		Admin a1 = new Admin("administrator", "hello", 0);
		Admin a2 = new Admin("information", "hello", 1);
		Admin a3 = new Admin("data", "hello", 1);
		// �������Ա������
		Group g1 = new Group(10001, "��������Ա��");
		Group g2 = new Group(10002, "ϵͳ����Ա��");
		// 3������Ȩ������
		Privilege p1 = new Privilege(101, "����Ա����ά��");
		Privilege p2 = new Privilege(102, "��Ա����ά��");
		Privilege p3 = new Privilege(103, "ϵͳ����ά��");
		Privilege p4 = new Privilege(104, "��Ϣ����ά��");
		Privilege p5 = new Privilege(105, "�������ά��");
		Privilege p6 = new Privilege(106, "��������ά��");
		// 4�����ù���Ա�͹���Ա���ϵ
		a1.getGroups().add(g1);
		a2.getGroups().add(g2);
		a3.getGroups().add(g2);
		// 5�����ù���Ա��͹���Ա��ϵ
		g1.getAdmins().add(a1);
		g2.getAdmins().add(a2);
		g2.getAdmins().add(a3);
		// 6�����ù���Ա���Ȩ��
		g1.getPrivileges().add(p1);
		g1.getPrivileges().add(p2);
		g1.getPrivileges().add(p3);
		g1.getPrivileges().add(p4);
		g1.getPrivileges().add(p5);
		g1.getPrivileges().add(p6);
		g2.getPrivileges().add(p3);
		g2.getPrivileges().add(p5);
		g2.getPrivileges().add(p6);
		// 7������Ȩ�޺͹���Ա���ϵ
		p1.getGroups().add(g1);
		p2.getGroups().add(g1);
		p3.getGroups().add(g1);
		p3.getGroups().add(g2);
		p4.getGroups().add(g1);
		p5.getGroups().add(g1);
		p5.getGroups().add(g2);
		p6.getGroups().add(g1);
		p6.getGroups().add(g2);

		// �ڶ��㣺�����ϵ
		System.out.println(a1.getInfo() + "�������������" + a1.getGroups().size());
		Group[] group = a1.getGroups().toArray();
		for (int x = 0; x < group.length; x++) {
			System.out.println("\t|- " + group[x].getInfo() + "��Ȩ�޸�����"
					+ group[x].getPrivileges().size());
			Privilege[] pri = group[x].getPrivileges().toArray();
			for (int y = 0; y < pri.length; y++) {
				System.out.println("\t\t|- " + pri[y].getInfo());
			}
		}
		System.out.println("==============================================");
		System.out.println(g2.getInfo() + "��Ȩ�޸���" + g2.getPrivileges().size());
		Privilege[] pri2 = g2.getPrivileges().toArray();
		for (int x = 0; x < pri2.length; x++) {
			System.out.println("\t|- " + pri2[x].getInfo());
		}
		Admin[] admin = g2.getAdmins().toArray();
		for (int x = 0; x < admin.length; x++) {
			System.out.println("\t|- " + admin[x].getInfo());
		}
		System.out.println("==============================================");
		System.out.println(p3.getInfo() + "���߱���Ȩ�޵Ĺ���Ա�������"
				+ p3.getGroups().size());
		Group[] group2 = p3.getGroups().toArray();
		for (int x = 0; x < group2.length; x++) {
			System.out.println("\t|- " + group2[x].getInfo());
			Admin[] admin2 = group2[x].getAdmins().toArray();
			for (int y = 0; y < admin2.length; y++) {
				System.out.println("\t\t|- " + admin2[y].getInfo());
			}
		}
	}
}

class Admin {
	private String aid;
	private String password;
	private int flag;
	private GroupLink groups;

	public Admin() {
		this.groups = new GroupLink();
	}

	public Admin(String aid, String password, int flag) {
		this();
		this.aid = aid;
		this.password = password;
		this.flag = flag;
	}

	public boolean compare(Admin admin) {
		if (admin == null) {
			return false;
		}
		if (this == admin) {
			return true;
		}
		if (this.aid.equals(admin.aid) && this.password.equals(admin.password)
				&& this.flag == admin.flag) {
			return true;
		}
		return false;
	}

	public GroupLink getGroups() {
		return this.groups;
	}

	public String getInfo() {
		return "����Ա��ţ�" + this.aid + "�����룺" + this.password + "����������Ա��"
				+ this.flag;
	}
}

class Group {
	private int gid;
	private String name;
	private AdminLink admins;
	private PrivilegeLink privileges;

	public Group() {
		this.admins = new AdminLink();
		this.privileges = new PrivilegeLink();
	}

	public Group(int gid, String name) {
		this();
		this.gid = gid;
		this.name = name;
	}

	public boolean compare(Group group) {
		if (group == null) {
			return false;
		}
		if (this == group) {
			return true;
		}
		if (this.gid == group.gid && this.name.equals(group.name)) {
			return true;
		}
		return false;
	}

	public AdminLink getAdmins() {
		return this.admins;
	}

	public PrivilegeLink getPrivileges() {
		return this.privileges;
	}

	public String getInfo() {
		return "����Ա���ţ�" + this.gid + "�����ƣ�" + this.name;
	}
}

class Privilege {
	private int pid;
	private String name;
	private GroupLink groups;

	public Privilege() {
		this.groups = new GroupLink();
	}

	public Privilege(int pid, String name) {
		this();
		this.pid = pid;
		this.name = name;
	}

	public boolean compare(Privilege pri) {
		if (pri == null) {
			return false;
		}
		if (this == pri) {
			return true;
		}
		if (this.pid == pri.pid && this.name.equals(pri.name)) {
			return true;
		}
		return false;
	}

	public GroupLink getGroups() {
		return this.groups;
	}

	public String getInfo() {
		return "Ȩ�ޱ�ţ�" + this.pid + "�����ƣ�" + this.name;
	}
}

// �˴���AdminLink���Ǵ�ǰ��DemoOne.java������copy��
// ��Linkȫ���滻ΪAdminLink
class AdminLink {
	// Node�಻��Ҫ���ⲿ����������Ϊ˽���ڲ���
	private class Node5 {
		private Admin data;
		private Node5 next;

		public Node5(Admin data) {
			this.data = data;
		}

		public void addNode(Node5 newNode) {
			if (this.next == null) {
				this.next = newNode;
			} else {
				this.next.addNode(newNode);
			}
		}

		public Admin getNode(int index) {
			if (index == AdminLink.this.foot++) {
				return this.data;
			} else {
				return this.next.getNode(index);
			}
		}

		public boolean containsNode(Admin keyWord) {
			if (this.data.compare(keyWord)) {
				return true;
			}
			if (this.next != null) {
				return this.next.containsNode(keyWord);
			}
			return false;
		}

		public void removeNode(Node5 previousNode, Admin keyWord) {
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

		public Admin[] toArrayNode() {
			AdminLink.this.retData[AdminLink.this.foot++] = this.data;// ???
			if (this.next != null) {
				this.next.toArrayNode();
			}
			return AdminLink.this.retData;
		}
	}

	// ���ڵ�
	private Node5 root;

	// ͳ�Ƹ���
	private int count;

	// �����������
	private int foot;

	// ������������
	private Admin[] retData;

	// �������ݵķ���������������ݷ�װΪһ��Node5�����
	// ��װ�ĺô������Խ��нڵ������
	// �˷����еĴ�������ݱ�����Node5����data���Ե�������ͬ
	public void add(Admin data) {
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
	// 1��������Ҫ������еĽڵ����������Ҫ��AdminLink��������count����
	// 2����add()����ִ�����֮����Ҫ���Ӹ���
	// 3����AdminLink���У�����size��������������Ԫ�ظ���
	public int size() {
		return this.count;
	}

	// �ж��Ƿ�Ϊ������
	public boolean isAdminty() {
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
	// 1����AdminLink��������foot���ԣ����ڱ������
	// 2������get()���������ڲ�ѯ����
	// 3����Node5���н��в�ѯ����ͬʱ�޸�foot����
	public Admin get(int index) {
		if (index >= this.count || index < 0) {
			return null;
		}
		this.foot = 0;
		return this.root.getNode(index);
	}

	// �ж�ָ�������Ƿ����
	// 1����AdminLink��������contains()����
	// 2���ж�keyWord�Ƿ�Ϊ��
	// 3����Node5���н��в�ѯ
	public boolean contains(Admin keyWord) {
		if (keyWord.compare(null)) {
			return false;
		}
		if (this.root == null) {
			return false;
		}
		return this.root.containsNode(keyWord);
	}

	// ɾ������
	// 1��ɾ���������Ǹ��ڵ㣬��AdminLink = AdminLink.next
	// 2��ɾ�������ݲ��Ǹ��ڵ㣬�����Node5��removeNode()����
	public void remove(Admin keyWord) {
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
	// �˶����������нڵ㶼�ɼ�����˶�����AdminLink���ڶ���
	public Admin[] toArray() {
		if (this.count == 0) {
			return null;
		}
		this.foot = 0;// ������������
		this.retData = new Admin[this.count];// �����С��count����
		return this.root.toArrayNode();
	}
}

// �˴���GroupLink���Ǵ�ǰ��DemoOne.java������copy��
// ��Linkȫ���滻ΪGroupLink
class GroupLink {
	// Node�಻��Ҫ���ⲿ����������Ϊ˽���ڲ���
	private class Node5 {
		private Group data;
		private Node5 next;

		public Node5(Group data) {
			this.data = data;
		}

		public void addNode(Node5 newNode) {
			if (this.next == null) {
				this.next = newNode;
			} else {
				this.next.addNode(newNode);
			}
		}

		public Group getNode(int index) {
			if (index == GroupLink.this.foot++) {
				return this.data;
			} else {
				return this.next.getNode(index);
			}
		}

		public boolean containsNode(Group keyWord) {
			if (this.data.compare(keyWord)) {
				return true;
			}
			if (this.next != null) {
				return this.next.containsNode(keyWord);
			}
			return false;
		}

		public void removeNode(Node5 previousNode, Group keyWord) {
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

		public Group[] toArrayNode() {
			GroupLink.this.retData[GroupLink.this.foot++] = this.data;// ???
			if (this.next != null) {
				this.next.toArrayNode();
			}
			return GroupLink.this.retData;
		}
	}

	// ���ڵ�
	private Node5 root;

	// ͳ�Ƹ���
	private int count;

	// �����������
	private int foot;

	// ������������
	private Group[] retData;

	// �������ݵķ���������������ݷ�װΪһ��Node5�����
	// ��װ�ĺô������Խ��нڵ������
	// �˷����еĴ�������ݱ�����Node5����data���Ե�������ͬ
	public void add(Group data) {
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
	// 1��������Ҫ������еĽڵ����������Ҫ��GroupLink��������count����
	// 2����add()����ִ�����֮����Ҫ���Ӹ���
	// 3����GroupLink���У�����size��������������Ԫ�ظ���
	public int size() {
		return this.count;
	}

	// �ж��Ƿ�Ϊ������
	public boolean isGroupty() {
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
	// 1����GroupLink��������foot���ԣ����ڱ������
	// 2������get()���������ڲ�ѯ����
	// 3����Node5���н��в�ѯ����ͬʱ�޸�foot����
	public Group get(int index) {
		if (index >= this.count || index < 0) {
			return null;
		}
		this.foot = 0;
		return this.root.getNode(index);
	}

	// �ж�ָ�������Ƿ����
	// 1����GroupLink��������contains()����
	// 2���ж�keyWord�Ƿ�Ϊ��
	// 3����Node5���н��в�ѯ
	public boolean contains(Group keyWord) {
		if (keyWord.compare(null)) {
			return false;
		}
		if (this.root == null) {
			return false;
		}
		return this.root.containsNode(keyWord);
	}

	// ɾ������
	// 1��ɾ���������Ǹ��ڵ㣬��GroupLink = GroupLink.next
	// 2��ɾ�������ݲ��Ǹ��ڵ㣬�����Node5��removeNode()����
	public void remove(Group keyWord) {
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
	// �˶����������нڵ㶼�ɼ�����˶�����GroupLink���ڶ���
	public Group[] toArray() {
		if (this.count == 0) {
			return null;
		}
		this.foot = 0;// ������������
		this.retData = new Group[this.count];// �����С��count����
		return this.root.toArrayNode();
	}
}

// �˴���PrivilegeLink���Ǵ�ǰ��DemoOne.java������copy��
// ��Linkȫ���滻ΪPrivilegeLink
class PrivilegeLink {
	// Node�಻��Ҫ���ⲿ����������Ϊ˽���ڲ���
	private class Node5 {
		private Privilege data;
		private Node5 next;

		public Node5(Privilege data) {
			this.data = data;
		}

		public void addNode(Node5 newNode) {
			if (this.next == null) {
				this.next = newNode;
			} else {
				this.next.addNode(newNode);
			}
		}

		public Privilege getNode(int index) {
			if (index == PrivilegeLink.this.foot++) {
				return this.data;
			} else {
				return this.next.getNode(index);
			}
		}

		public boolean containsNode(Privilege keyWord) {
			if (this.data.compare(keyWord)) {
				return true;
			}
			if (this.next != null) {
				return this.next.containsNode(keyWord);
			}
			return false;
		}

		public void removeNode(Node5 previousNode, Privilege keyWord) {
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

		public Privilege[] toArrayNode() {
			PrivilegeLink.this.retData[PrivilegeLink.this.foot++] = this.data;// ???
			if (this.next != null) {
				this.next.toArrayNode();
			}
			return PrivilegeLink.this.retData;
		}
	}

	// ���ڵ�
	private Node5 root;

	// ͳ�Ƹ���
	private int count;

	// �����������
	private int foot;

	// ������������
	private Privilege[] retData;

	// �������ݵķ���������������ݷ�װΪһ��Node5�����
	// ��װ�ĺô������Խ��нڵ������
	// �˷����еĴ�������ݱ�����Node5����data���Ե�������ͬ
	public void add(Privilege data) {
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
	// 1��������Ҫ������еĽڵ����������Ҫ��PrivilegeLink��������count����
	// 2����add()����ִ�����֮����Ҫ���Ӹ���
	// 3����PrivilegeLink���У�����size��������������Ԫ�ظ���
	public int size() {
		return this.count;
	}

	// �ж��Ƿ�Ϊ������
	public boolean isPrivilegety() {
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
	// 1����PrivilegeLink��������foot���ԣ����ڱ������
	// 2������get()���������ڲ�ѯ����
	// 3����Node5���н��в�ѯ����ͬʱ�޸�foot����
	public Privilege get(int index) {
		if (index >= this.count || index < 0) {
			return null;
		}
		this.foot = 0;
		return this.root.getNode(index);
	}

	// �ж�ָ�������Ƿ����
	// 1����PrivilegeLink��������contains()����
	// 2���ж�keyWord�Ƿ�Ϊ��
	// 3����Node5���н��в�ѯ
	public boolean contains(Privilege keyWord) {
		if (keyWord.compare(null)) {
			return false;
		}
		if (this.root == null) {
			return false;
		}
		return this.root.containsNode(keyWord);
	}

	// ɾ������
	// 1��ɾ���������Ǹ��ڵ㣬��PrivilegeLink = PrivilegeLink.next
	// 2��ɾ�������ݲ��Ǹ��ڵ㣬�����Node5��removeNode()����
	public void remove(Privilege keyWord) {
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
	// �˶����������нڵ㶼�ɼ�����˶�����PrivilegeLink���ڶ���
	public Privilege[] toArray() {
		if (this.count == 0) {
			return null;
		}
		this.foot = 0;// ������������
		this.retData = new Privilege[this.count];// �����С��count����
		return this.root.toArrayNode();
	}
}