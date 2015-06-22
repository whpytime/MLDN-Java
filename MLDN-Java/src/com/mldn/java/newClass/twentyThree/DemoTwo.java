package com.mldn.java.newClass.twentyThree;

public class DemoTwo {

	public static void main(String[] args) {
		// 第一层：设置关系
		// 1、定义管理员数据
		Admin a1 = new Admin("administrator", "hello", 0);
		Admin a2 = new Admin("information", "hello", 1);
		Admin a3 = new Admin("data", "hello", 1);
		// 定义管理员组数据
		Group g1 = new Group(10001, "超级管理员组");
		Group g2 = new Group(10002, "系统管理员组");
		// 3、定义权限数据
		Privilege p1 = new Privilege(101, "管理员数据维护");
		Privilege p2 = new Privilege(102, "雇员数据维护");
		Privilege p3 = new Privilege(103, "系统数据维护");
		Privilege p4 = new Privilege(104, "信息数据维护");
		Privilege p5 = new Privilege(105, "审核数据维护");
		Privilege p6 = new Privilege(106, "备份数据维护");
		// 4、设置管理员和管理员组关系
		a1.getGroups().add(g1);
		a2.getGroups().add(g2);
		a3.getGroups().add(g2);
		// 5、设置管理员组和管理员关系
		g1.getAdmins().add(a1);
		g2.getAdmins().add(a2);
		g2.getAdmins().add(a3);
		// 6、设置管理员组和权限
		g1.getPrivileges().add(p1);
		g1.getPrivileges().add(p2);
		g1.getPrivileges().add(p3);
		g1.getPrivileges().add(p4);
		g1.getPrivileges().add(p5);
		g1.getPrivileges().add(p6);
		g2.getPrivileges().add(p3);
		g2.getPrivileges().add(p5);
		g2.getPrivileges().add(p6);
		// 7、设置权限和管理员组关系
		p1.getGroups().add(g1);
		p2.getGroups().add(g1);
		p3.getGroups().add(g1);
		p3.getGroups().add(g2);
		p4.getGroups().add(g1);
		p5.getGroups().add(g1);
		p5.getGroups().add(g2);
		p6.getGroups().add(g1);
		p6.getGroups().add(g2);

		// 第二层：输出关系
		System.out.println(a1.getInfo() + "，所在组个数：" + a1.getGroups().size());
		Group[] group = a1.getGroups().toArray();
		for (int x = 0; x < group.length; x++) {
			System.out.println("\t|- " + group[x].getInfo() + "，权限个数："
					+ group[x].getPrivileges().size());
			Privilege[] pri = group[x].getPrivileges().toArray();
			for (int y = 0; y < pri.length; y++) {
				System.out.println("\t\t|- " + pri[y].getInfo());
			}
		}
		System.out.println("==============================================");
		System.out.println(g2.getInfo() + "，权限个数" + g2.getPrivileges().size());
		Privilege[] pri2 = g2.getPrivileges().toArray();
		for (int x = 0; x < pri2.length; x++) {
			System.out.println("\t|- " + pri2[x].getInfo());
		}
		Admin[] admin = g2.getAdmins().toArray();
		for (int x = 0; x < admin.length; x++) {
			System.out.println("\t|- " + admin[x].getInfo());
		}
		System.out.println("==============================================");
		System.out.println(p3.getInfo() + "，具备此权限的管理员组个数："
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
		return "管理员编号：" + this.aid + "，密码：" + this.password + "，超级管理员："
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
		return "管理员组编号：" + this.gid + "，名称：" + this.name;
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
		return "权限编号：" + this.pid + "，名称：" + this.name;
	}
}

// 此处的AdminLink类是从前面DemoOne.java程序中copy来
// 讲Link全部替换为AdminLink
class AdminLink {
	// Node类不需要被外部所见，定义为私有内部类
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

	// 根节点
	private Node5 root;

	// 统计个数
	private int count;

	// 标记索引数据
	private int foot;

	// 保存对象的数组
	private Admin[] retData;

	// 增加数据的方法，将传入的数据封装为一个Node5类对象，
	// 封装的好处：可以进行节点的排列
	// 此方法中的传入的数据必须与Node5类中data属性的类型相同
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
		// 增加个数
		this.count++;
	}

	// 取得链表中保存的元素的个数
	// 每当一个新数据保存之后，应该进行一个数据的修改
	// 1、由于需要针对所有的节点操作，则需要在AdminLink类中增加count属性
	// 2、在add()方法执行完毕之后，需要增加个数
	// 3、在AdminLink类中，增加size方法，返回链表元素个数
	public int size() {
		return this.count;
	}

	// 判断是否为空链表
	public boolean isAdminty() {
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
	// 1、在AdminLink类中增加foot属性，用于标记索引
	// 2、增加get()方法，用于查询数据
	// 3、在Node5类中进行查询，并同时修改foot属性
	public Admin get(int index) {
		if (index >= this.count || index < 0) {
			return null;
		}
		this.foot = 0;
		return this.root.getNode(index);
	}

	// 判断指定数据是否存在
	// 1、在AdminLink类中增加contains()方法
	// 2、判断keyWord是否为空
	// 3、在Node5类中进行查询
	public boolean contains(Admin keyWord) {
		if (keyWord.compare(null)) {
			return false;
		}
		if (this.root == null) {
			return false;
		}
		return this.root.containsNode(keyWord);
	}

	// 删除数据
	// 1、删除的数据是根节点，则AdminLink = AdminLink.next
	// 2、删除的数据不是根节点，则调用Node5中removeNode()方法
	public void remove(Admin keyWord) {
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
	// 此对象数组所有节点都可见，因此定义在AdminLink类内定义
	public Admin[] toArray() {
		if (this.count == 0) {
			return null;
		}
		this.foot = 0;// 设置数组索引
		this.retData = new Admin[this.count];// 数组大小由count决定
		return this.root.toArrayNode();
	}
}

// 此处的GroupLink类是从前面DemoOne.java程序中copy来
// 讲Link全部替换为GroupLink
class GroupLink {
	// Node类不需要被外部所见，定义为私有内部类
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

	// 根节点
	private Node5 root;

	// 统计个数
	private int count;

	// 标记索引数据
	private int foot;

	// 保存对象的数组
	private Group[] retData;

	// 增加数据的方法，将传入的数据封装为一个Node5类对象，
	// 封装的好处：可以进行节点的排列
	// 此方法中的传入的数据必须与Node5类中data属性的类型相同
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
		// 增加个数
		this.count++;
	}

	// 取得链表中保存的元素的个数
	// 每当一个新数据保存之后，应该进行一个数据的修改
	// 1、由于需要针对所有的节点操作，则需要在GroupLink类中增加count属性
	// 2、在add()方法执行完毕之后，需要增加个数
	// 3、在GroupLink类中，增加size方法，返回链表元素个数
	public int size() {
		return this.count;
	}

	// 判断是否为空链表
	public boolean isGroupty() {
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
	// 1、在GroupLink类中增加foot属性，用于标记索引
	// 2、增加get()方法，用于查询数据
	// 3、在Node5类中进行查询，并同时修改foot属性
	public Group get(int index) {
		if (index >= this.count || index < 0) {
			return null;
		}
		this.foot = 0;
		return this.root.getNode(index);
	}

	// 判断指定数据是否存在
	// 1、在GroupLink类中增加contains()方法
	// 2、判断keyWord是否为空
	// 3、在Node5类中进行查询
	public boolean contains(Group keyWord) {
		if (keyWord.compare(null)) {
			return false;
		}
		if (this.root == null) {
			return false;
		}
		return this.root.containsNode(keyWord);
	}

	// 删除数据
	// 1、删除的数据是根节点，则GroupLink = GroupLink.next
	// 2、删除的数据不是根节点，则调用Node5中removeNode()方法
	public void remove(Group keyWord) {
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
	// 此对象数组所有节点都可见，因此定义在GroupLink类内定义
	public Group[] toArray() {
		if (this.count == 0) {
			return null;
		}
		this.foot = 0;// 设置数组索引
		this.retData = new Group[this.count];// 数组大小由count决定
		return this.root.toArrayNode();
	}
}

// 此处的PrivilegeLink类是从前面DemoOne.java程序中copy来
// 讲Link全部替换为PrivilegeLink
class PrivilegeLink {
	// Node类不需要被外部所见，定义为私有内部类
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

	// 根节点
	private Node5 root;

	// 统计个数
	private int count;

	// 标记索引数据
	private int foot;

	// 保存对象的数组
	private Privilege[] retData;

	// 增加数据的方法，将传入的数据封装为一个Node5类对象，
	// 封装的好处：可以进行节点的排列
	// 此方法中的传入的数据必须与Node5类中data属性的类型相同
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
		// 增加个数
		this.count++;
	}

	// 取得链表中保存的元素的个数
	// 每当一个新数据保存之后，应该进行一个数据的修改
	// 1、由于需要针对所有的节点操作，则需要在PrivilegeLink类中增加count属性
	// 2、在add()方法执行完毕之后，需要增加个数
	// 3、在PrivilegeLink类中，增加size方法，返回链表元素个数
	public int size() {
		return this.count;
	}

	// 判断是否为空链表
	public boolean isPrivilegety() {
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
	// 1、在PrivilegeLink类中增加foot属性，用于标记索引
	// 2、增加get()方法，用于查询数据
	// 3、在Node5类中进行查询，并同时修改foot属性
	public Privilege get(int index) {
		if (index >= this.count || index < 0) {
			return null;
		}
		this.foot = 0;
		return this.root.getNode(index);
	}

	// 判断指定数据是否存在
	// 1、在PrivilegeLink类中增加contains()方法
	// 2、判断keyWord是否为空
	// 3、在Node5类中进行查询
	public boolean contains(Privilege keyWord) {
		if (keyWord.compare(null)) {
			return false;
		}
		if (this.root == null) {
			return false;
		}
		return this.root.containsNode(keyWord);
	}

	// 删除数据
	// 1、删除的数据是根节点，则PrivilegeLink = PrivilegeLink.next
	// 2、删除的数据不是根节点，则调用Node5中removeNode()方法
	public void remove(Privilege keyWord) {
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
	// 此对象数组所有节点都可见，因此定义在PrivilegeLink类内定义
	public Privilege[] toArray() {
		if (this.count == 0) {
			return null;
		}
		this.foot = 0;// 设置数组索引
		this.retData = new Privilege[this.count];// 数组大小由count决定
		return this.root.toArrayNode();
	}
}