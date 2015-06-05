package com.mldn.java.newClass.twentyOne;

public class LinkDemo {

	public static void main(String[] args) {

	}
}

class Link4 {
	private class Node4 {// Node类不需要被外部所见
		private String data;
		private Node4 next;

		public Node4(String data) {
			this.data = data;
		}
	}

	private Node4 root;

}