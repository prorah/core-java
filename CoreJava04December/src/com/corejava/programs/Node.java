package com.corejava.programs;

public class Node<K> {
	private K value;
	private Node<K> nextNode;

	public K getValue() {
		return value;
	}

	public void setValue(K value) {
		this.value = value;
	}

	public Node<K> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<K> nextNode) {
		this.nextNode = nextNode;
	}

}
