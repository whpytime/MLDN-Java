package com.mldn.java.newClass.twentyOne;

public class DemoThree {

	public static void main(String[] args) {
		Link all = new Link();
		all.add("A");
		all.add("B");
		all.add("C");
		all.print();
	}
}

class Node3 {
	private String data;
	private Node3 next;

	public Node3(String data) {
		this.data = data;
	}

	public String getData() {
		return this.data;
	}

	public void setNext(Node3 next) {
		this.next = next;
	}

	public Node3 getNext() {
		return this.next;
	}

	public void addNode(Node3 newNode) {
		if (this.next == null) {
			this.next = newNode;
		} else {
			this.next.addNode(newNode);
		}
	}

	public void printNode() {
		System.out.println(this.data);
		if (this.next != null) {
			this.next.printNode();
		}
	}
}

class Link {// 操作节点的类
	private Node3 root;

	public void add(String data) {
		Node3 newNode = new Node3(data);
		if (this.root == null) {
			this.root = newNode;
		} else {
			this.root.addNode(newNode);
		}
	}

	public void print() {
		if (this.root != null) {
			this.root.printNode();
		}
	}
}