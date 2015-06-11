package com.mldn.java.newClass.twentyThree;

public class DemoThree {
	public static void main(String[] args) {
		User ua = new User("С����", "111");
		User ub = new User("Сл��", "222");
		User uc = new User("С����", "333");
		Soft s1 = new Soft(1, "�����Ķ�");
		Soft s2 = new Soft(2, "ͼƬ���");
		Soft s3 = new Soft(3, "��Ƶ����");
		Soft s4 = new Soft(4, "������Ϸ");
		Soft s5 = new Soft(5, "������Ϸ");
		Soft s6 = new Soft(6, "��ɽ����");
		Soft s7 = new Soft(7, "����ɱ��");
		Soft s8 = new Soft(8, "����ɱ��");

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

		{// �ҵ�һ���û���������Ϣ
			System.out
					.println(ua.getInfo() + "������������" + ua.getRecords().size());
			Record[] rec = ua.getRecords().toArray();
			for (int x = 0; x < rec.length; x++) {
				System.out.println(rec[x].getInfo());
			}
		}
		System.out.println("=========================================");
		{// �ҵ�һ�������������
			System.out.println(s1.getInfo() + "����������" + s1.getRecords().size());
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
		return "�û���ţ�" + this.uid + "�����룺" + this.password;
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
		return "�����ţ�" + this.sid + "�����ƣ�" + this.name;
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
		return "���ؼ�¼��ţ�" + this.rid + "\n\t|- " + this.user.getInfo()
				+ "\n\t|- " + this.soft.getInfo();
	}
}

class RecordLink {
	// Node�಻��Ҫ���ⲿ����������Ϊ˽���ڲ���
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

	// ���ڵ�
	private Node root;

	// ͳ�Ƹ���
	private int count;

	// �����������
	private int foot;

	// ������������
	private Record[] retData;

	// �������ݵķ���������������ݷ�װΪһ��Node�����
	// ��װ�ĺô������Խ��нڵ������
	// �˷����еĴ�������ݱ�����Node����data���Ե�������ͬ
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
	// 1����RecordLink��������foot���ԣ����ڱ������
	// 2������get()���������ڲ�ѯ����
	// 3����Node���н��в�ѯ����ͬʱ�޸�foot����
	public Record get(int index) {
		if (index >= this.count || index < 0) {
			return null;
		}
		this.foot = 0;
		return this.root.getNode(index);
	}

	// �ж�ָ�������Ƿ����
	// 1����RecordLink��������contains()����
	// 2���ж�keyWord�Ƿ�Ϊ��
	// 3����Node���н��в�ѯ
	public boolean contains(Record keyWord) {
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
	// 2��ɾ�������ݲ��Ǹ��ڵ㣬�����Node��removeNode()����
	public void remove(Record keyWord) {
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
	public Record[] toArray() {
		if (this.count == 0) {
			return null;
		}
		this.foot = 0;// ������������
		this.retData = new Record[this.count];// �����С��count����
		return this.root.toArrayNode();
	}
}
