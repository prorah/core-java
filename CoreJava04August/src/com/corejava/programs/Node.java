package com.corejava.programs;

public class Node<K> {
	private K data;
	private Node<K> nextNode;

	public K getData() {
		return data;
	}

	public void setData(K data) {
		this.data = data;
	}

	public Node<K> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<K> nextNode) {
		this.nextNode = nextNode;
	}

}
