package com.mldn.java.newClass.twentyOne;

public class LinkDemo {

	public static void main(String[] args) {
		Node root = new Node("A");
		Node n1 = new Node("B");
		Node n2 = new Node("C");
		root.setNext(n1);
		n1.setNext(n2);

		Node currentNode = root;
		while (currentNode != null) {
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNext();
		}
	}
}

class Node {
	private String data;
	private Node next;

	public Node(String data) {
		this.data = data;
	}

	public String getData() {
		return this.data;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getNext() {
		return this.next;
	}
}