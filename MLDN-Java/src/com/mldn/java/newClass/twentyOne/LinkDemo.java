package com.mldn.java.newClass.twentyOne;

public class LinkDemo {

	public static void main(String[] args) {
		Link4 all = new Link4();
		System.out.println(all.size());// 0
		System.out.println(all.isEmpty());// true
		all.add("A");
		all.add("B");
		all.add("C");
		System.out.println(all.size());// 3
		System.out.println("1==============");
		System.out.println(all.isEmpty());// false
		System.out.println(all.get(0));// A
		System.out.println(all.get(1));// B
		System.out.println(all.get(10));// null
		System.out.println("2==============");
		System.out.println(all.contains("B"));// true
		all.remove("B");
		System.out.println(all.contains("A"));// true
		System.out.println(all.contains("B"));// false
		System.out.println(all.get(0));// A
		System.out.println(all.get(1));// C
		System.out.println(all.get(2));// null
		System.out.println("3==============");
		all.add("B");
		all.add("D");
		String[] temp = all.toArray();
		for (int x = 0; x < temp.length; x++) {
			System.out.println(temp[x]);// A,C,B,D
		}
	}
}

class Link4 {
	// Node�಻��Ҫ���ⲿ����������Ϊ˽���ڲ���
	private class Node4 {
		private String data;
		private Node4 next;

		public Node4(String data) {
			this.data = data;
		}

		public void addNode(Node4 newNode) {
			if (this.next == null) {
				this.next = newNode;
			} else {
				this.next.addNode(newNode);
			}
		}

		public String getNode(int index) {
			if (index == Link4.this.foot++) {
				return this.data;
			} else {
				return this.next.getNode(index);
			}
		}

		public boolean containsNode(String keyWord) {
			if (this.data.equals(keyWord)) {
				return true;
			}
			if (this.next != null) {
				return this.next.containsNode(keyWord);
			}
			return false;
		}

		public void removeNode(Node4 previousNode, String keyWord) {
			if (this.data.equals(keyWord)) {
				previousNode.next = this.next;
			} else {
				if (this.next != null) {
					return;
				} else {
					this.next.removeNode(this, keyWord);
				}
			}
		}

		public String[] toArrayNode() {
			Link4.this.retData[Link4.this.foot++] = this.data;// ???
			if (this.next != null) {
				this.next.toArrayNode();
			}
			return Link4.this.retData;
		}
	}

	// ���ڵ�
	private Node4 root;

	// ͳ�Ƹ���
	private int count;

	// �����������
	private int foot;

	// ������������
	private String[] retData;

	// �������ݵķ���������������ݷ�װΪһ��Node4�����
	// ��װ�ĺô������Խ��нڵ������
	// �˷����еĴ�������ݱ�����Node4����data���Ե�������ͬ
	public void add(String data) {
		if (data == null) {
			return;
		}
		Node4 newNode = new Node4(data);
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
	// 1����Link4��������foot���ԣ����ڱ������
	// 2������get()���������ڲ�ѯ����
	// 3����Node4���н��в�ѯ����ͬʱ�޸�foot����
	public String get(int index) {
		if (index >= this.count || index < 0) {
			return null;
		}
		this.foot = 0;
		return this.root.getNode(index);
	}

	// �ж�ָ�������Ƿ����
	// 1����Link4��������contains()����
	// 2���ж�keyWord�Ƿ�Ϊ��
	// 3����Node4���н��в�ѯ
	public boolean contains(String keyWord) {
		if (keyWord.equals(null)) {
			return false;
		}
		if (this.root == null) {
			return false;
		}
		return this.root.containsNode(keyWord);
	}

	// ɾ������
	// 1��ɾ���������Ǹ��ڵ㣬��link = link.next
	// 2��ɾ�������ݲ��Ǹ��ڵ㣬�����Node4��removeNode()����
	public void remove(String keyWord) {
		if (this.root == null || keyWord == null) {
			return;
		}
		if (this.contains(keyWord)) {
			if (this.root.data.equals(keyWord)) {
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
	public String[] toArray() {
		if (this.count == 0) {
			return null;
		}
		this.foot = 0;// ������������
		this.retData = new String[this.count];// �����С��count����
		return this.root.toArrayNode();
	}
}
