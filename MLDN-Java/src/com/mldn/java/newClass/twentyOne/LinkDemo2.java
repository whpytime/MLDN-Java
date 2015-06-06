package com.mldn.java.newClass.twentyOne;

public class LinkDemo2 {

	public static void main(String[] args) {
		Node2 root = new Node2("A");
		Node2 n1 = new Node2("B");
		Node2 n2 = new Node2("c");
		root.setNext(n1);
		n1.setNext(n2);
		print(root);
	}

	public static void print(Node2 currentNode) {
		if (currentNode != null) {
			System.out.println(currentNode.getData());
			print(currentNode.getNext());
		}
	}
}

class Node2 {
	private String data;
	private Node2 next;

	public Node2(String data) {
		this.data = data;
	}

	public void setNext(Node2 next) {
		this.next = next;
	}

	public Node2 getNext() {
		return this.next;
	}

	public String getData() {
		return this.data;
	}
}