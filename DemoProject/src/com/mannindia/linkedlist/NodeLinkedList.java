package com.mannindia.linkedlist;

public class NodeLinkedList<T> implements Comparable<T> {

	private T value;
	private NodeLinkedList<T> nextNode;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public NodeLinkedList<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(NodeLinkedList<T> nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public int compareTo(T arg) {
		if (arg == this.value) {
			return 0;
		} else {
			return 1;
		}
	}

}
