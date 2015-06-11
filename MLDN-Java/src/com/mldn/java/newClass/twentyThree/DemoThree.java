package com.mldn.java.newClass.twentyThree;

public class DemoThree {
	public static void main(String[] args) {
		User ua = new User("小金子", "111");
		User ub = new User("小谢子", "222");
		User uc = new User("小掉子", "333");
		Soft s1 = new Soft(1, "文字阅读");
		Soft s2 = new Soft(2, "图片浏览");
		Soft s3 = new Soft(3, "视频播放");
		Soft s4 = new Soft(4, "篮球游戏");
		Soft s5 = new Soft(5, "足球游戏");
		Soft s6 = new Soft(6, "金山毒霸");
		Soft s7 = new Soft(7, "瑞星杀毒");
		Soft s8 = new Soft(8, "江民杀毒");

		Record r1 = new Record(1001, ua, s6);
		Record r2 = new Record(1002, ua, s7);
		Record r3 = new Record(1003, ua, s8);

		Record r5 = new Record(2001, ub, s1);
		Record r6 = new Record(2002, ub, s2);
		Record r7 = new Record(2003, ub, s3);

		Record r8 = new Record(3001, uc, s4);
		Record r9 = new Record(3002, uc, s5);
		Record ra = new Record(3003, uc, s1);
		Record rb = new Record(3004, uc, s2);
		Record rc = new Record(3005, uc, s3);

		ua.getRecords().add(r1);
		ua.getRecords().add(r2);
		ua.getRecords().add(r3);
		s6.getRecords().add(r1);
		s7.getRecords().add(r2);
		s8.getRecords().add(r3);

		ub.getRecords().add(r5);
		ub.getRecords().add(r6);
		ub.getRecords().add(r7);
		s1.getRecords().add(r5);
		s2.getRecords().add(r6);
		s3.getRecords().add(r7);

		uc.getRecords().add(r8);
		uc.getRecords().add(r9);
		uc.getRecords().add(ra);
		uc.getRecords().add(rb);
		uc.getRecords().add(rc);

		s1.getRecords().add(ra);
		s2.getRecords().add(rb);
		s3.getRecords().add(rc);
		s4.getRecords().add(r8);
		s5.getRecords().add(r9);

		{// 找到一个用户的下载信息
			System.out
					.println(ua.getInfo() + "，下载数量：" + ua.getRecords().size());
			Record[] rec = ua.getRecords().toArray();
			for (int x = 0; x < rec.length; x++) {
				System.out.println(rec[x].getInfo());
			}
		}
		System.out.println("=========================================");
		{// 找到一个软件的下载量
			System.out.println(s1.getInfo() + "，下载量：" + s1.getRecords().size());
			Record[] rec = s1.getRecords().toArray();
			for (int x = 0; x < rec.length; x++) {
				System.out.println(rec[x].getInfo());
			}
		}
	}
}

class User {
	private String uid;
	private String password;
	private RecordLink records;

	public User() {
		this.records = new RecordLink();
	}

	public User(String uid, String password) {
		this();
		this.uid = uid;
		this.password = password;
	}

	public String getInfo() {
		return "用户编号：" + this.uid + "，密码：" + this.password;
	}

	public boolean compare(User user) {
		if (user == null) {
			return false;
		}
		if (this == user) {
			return true;
		}
		if (this.uid.equals(user.uid) && this.password.equals(user.password)) {
			return true;
		}
		return false;
	}

	public RecordLink getRecords() {
		return this.records;
	}
}

class Soft {
	private int sid;
	private String name;
	private RecordLink records;

	public Soft() {
		this.records = new RecordLink();
	}

	public Soft(int sid, String name) {
		this();
		this.sid = sid;
		this.name = name;
	}

	public boolean compare(Soft soft) {
		if (soft == null) {
			return false;
		}
		if (this == soft) {
			return true;
		}
		if (this.sid == soft.sid && this.name.equals(soft.name)) {
			return true;
		}
		return false;
	}

	public RecordLink getRecords() {
		return this.records;
	}

	public String getInfo() {
		return "软件编号：" + this.sid + "，名称：" + this.name;
	}

}

class Record {
	private int rid;
	private User user;
	private Soft soft;

	public Record() {

	}

	public Record(int rid, User user, Soft soft) {
		this.rid = rid;
		this.user = user;
		this.soft = soft;
	}

	public boolean compare(Record record) {
		if (record == null) {
			return false;
		}
		if (this == record) {
			return true;
		}
		if (this.rid == record.rid && this.user.compare(record.user)
				&& this.soft.compare(record.soft)) {
			return true;
		}
		return false;
	}

	public String getInfo() {
		return "下载记录编号：" + this.rid + "\n\t|- " + this.user.getInfo()
				+ "\n\t|- " + this.soft.getInfo();
	}
}

class RecordLink {
	// Node类不需要被外部所见，定义为私有内部类
	private class Node {
		private Record data;
		private Node next;

		public Node(Record data) {
			this.data = data;
		}

		public void addNode(Node newNode) {
			if (this.next == null) {
				this.next = newNode;
			} else {
				this.next.addNode(newNode);
			}
		}

		public Record getNode(int index) {
			if (index == RecordLink.this.foot++) {
				return this.data;
			} else {
				return this.next.getNode(index);
			}
		}

		public boolean containsNode(Record keyWord) {
			if (this.data.compare(keyWord)) {
				return true;
			}
			if (this.next != null) {
				return this.next.containsNode(keyWord);
			}
			return false;
		}

		public void removeNode(Node previousNode, Record keyWord) {
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

		public Record[] toArrayNode() {
			RecordLink.this.retData[RecordLink.this.foot++] = this.data;// ???
			if (this.next != null) {
				this.next.toArrayNode();
			}
			return RecordLink.this.retData;
		}
	}

	// 根节点
	private Node root;

	// 统计个数
	private int count;

	// 标记索引数据
	private int foot;

	// 保存对象的数组
	private Record[] retData;

	// 增加数据的方法，将传入的数据封装为一个Node类对象，
	// 封装的好处：可以进行节点的排列
	// 此方法中的传入的数据必须与Node类中data属性的类型相同
	public void add(Record data) {
		if (data == null) {
			return;
		}
		Node newNode = new Node(data);
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
	// 1、在RecordLink类中增加foot属性，用于标记索引
	// 2、增加get()方法，用于查询数据
	// 3、在Node类中进行查询，并同时修改foot属性
	public Record get(int index) {
		if (index >= this.count || index < 0) {
			return null;
		}
		this.foot = 0;
		return this.root.getNode(index);
	}

	// 判断指定数据是否存在
	// 1、在RecordLink类中增加contains()方法
	// 2、判断keyWord是否为空
	// 3、在Node类中进行查询
	public boolean contains(Record keyWord) {
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
	// 2、删除的数据不是根节点，则调用Node中removeNode()方法
	public void remove(Record keyWord) {
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
	public Record[] toArray() {
		if (this.count == 0) {
			return null;
		}
		this.foot = 0;// 设置数组索引
		this.retData = new Record[this.count];// 数组大小由count决定
		return this.root.toArrayNode();
	}
}
