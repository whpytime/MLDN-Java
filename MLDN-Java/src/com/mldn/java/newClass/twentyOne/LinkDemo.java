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
	// Node类不需要被外部所见，定义为私有内部类
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

	// 根节点
	private Node4 root;

	// 统计个数
	private int count;

	// 标记索引数据
	private int foot;

	// 保存对象的数组
	private String[] retData;

	// 增加数据的方法，将传入的数据封装为一个Node4类对象，
	// 封装的好处：可以进行节点的排列
	// 此方法中的传入的数据必须与Node4类中data属性的类型相同
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
	// 1、在Link4类中增加foot属性，用于标记索引
	// 2、增加get()方法，用于查询数据
	// 3、在Node4类中进行查询，并同时修改foot属性
	public String get(int index) {
		if (index >= this.count || index < 0) {
			return null;
		}
		this.foot = 0;
		return this.root.getNode(index);
	}

	// 判断指定数据是否存在
	// 1、在Link4类中增加contains()方法
	// 2、判断keyWord是否为空
	// 3、在Node4类中进行查询
	public boolean contains(String keyWord) {
		if (keyWord.equals(null)) {
			return false;
		}
		if (this.root == null) {
			return false;
		}
		return this.root.containsNode(keyWord);
	}

	// 删除数据
	// 1、删除的数据是根节点，则link = link.next
	// 2、删除的数据不是根节点，则调用Node4中removeNode()方法
	public void remove(String keyWord) {
		if (this.root == null || keyWord == null) {
			return;
		}
		if (this.contains(keyWord)) {
			if (this.root.data.equals(keyWord)) {
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
	public String[] toArray() {
		if (this.count == 0) {
			return null;
		}
		this.foot = 0;// 设置数组索引
		this.retData = new String[this.count];// 数组大小由count决定
		return this.root.toArrayNode();
	}
}
