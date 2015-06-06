package com.mldn.java.newClass.twentyOne;

public class LinkDemo2 {

	public static void main(String[] args) {
		Link5 all = new Link5();
		System.out.println(all.size());// 0
		System.out.println(all.isEmpty());// true
		all.add(new Person("A", 20));
		all.add(new Person("B", 30));
		all.add(new Person("C", 40));
		System.out.println(all.size());// 3
		System.out.println("1==============");
		System.out.println(all.isEmpty());// false
		System.out.println(all.get(0).getInfo());// A
		System.out.println(all.get(1).getInfo());// B
		//System.out.println(all.get(10).getInfo());// null
		System.out.println("2==============");
		System.out.println(all.contains(new Person("B", 30)));// true
		all.remove(new Person("B", 30));
		System.out.println(all.contains(new Person("A", 20)));// true
		System.out.println(all.contains(new Person("B", 30)));// false
		System.out.println(all.get(0).getInfo());// A
		System.out.println(all.get(1).getInfo());// C
		//System.out.println(all.get(2).getInfo());// null
		System.out.println("3==============");
		all.add(new Person("B", 30));
		all.add(new Person("D", 50));
		Person[] temp = all.toArray();
		for (int x = 0; x < temp.length; x++) {
			System.out.println(temp[x].getInfo());// A,C,B,D
		}
	}
}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean compare(Person per) {
		if (this == per) {
			return true;
		}
		if (per == null) {
			return false;
		}
		if (this.name.equals(per.name) && this.age == per.age) {
			return true;
		}
		return false;
	}

	public String getInfo() {
		return "������" + this.name + "�����䣺" + this.age;
	}
}

class Link5 {
	// Node�಻��Ҫ���ⲿ����������Ϊ˽���ڲ���
	private class Node5 {
		private Person data;
		private Node5 next;

		public Node5(Person data) {
			this.data = data;
		}

		public void addNode(Node5 newNode) {
			if (this.next == null) {
				this.next = newNode;
			} else {
				this.next.addNode(newNode);
			}
		}

		public Person getNode(int index) {
			if (index == Link5.this.foot++) {
				return this.data;
			} else {
				return this.next.getNode(index);
			}
		}

		public boolean containsNode(Person keyWord) {
			if (this.data.compare(keyWord)) {
				return true;
			}
			if (this.next != null) {
				return this.next.containsNode(keyWord);
			}
			return false;
		}

		public void removeNode(Node5 previousNode, Person keyWord) {
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

		public Person[] toArrayNode() {
			Link5.this.retData[Link5.this.foot++] = this.data;// ???
			if (this.next != null) {
				this.next.toArrayNode();
			}
			return Link5.this.retData;
		}
	}

	// ���ڵ�
	private Node5 root;

	// ͳ�Ƹ���
	private int count;

	// �����������
	private int foot;

	// ������������
	private Person[] retData;

	// �������ݵķ���������������ݷ�װΪһ��Node5�����
	// ��װ�ĺô������Խ��нڵ������
	// �˷����еĴ�������ݱ�����Node5����data���Ե�������ͬ
	public void add(Person data) {
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
	// 1����Link5��������foot���ԣ����ڱ������
	// 2������get()���������ڲ�ѯ����
	// 3����Node5���н��в�ѯ����ͬʱ�޸�foot����
	public Person get(int index) {
		if (index >= this.count || index < 0) {
			return null;
		}
		this.foot = 0;
		return this.root.getNode(index);
	}

	// �ж�ָ�������Ƿ����
	// 1����Link5��������contains()����
	// 2���ж�keyWord�Ƿ�Ϊ��
	// 3����Node5���н��в�ѯ
	public boolean contains(Person keyWord) {
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
	public void remove(Person keyWord) {
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
	public Person[] toArray() {
		if (this.count == 0) {
			return null;
		}
		this.foot = 0;// ������������
		this.retData = new Person[this.count];// �����С��count����
		return this.root.toArrayNode();
	}
}
