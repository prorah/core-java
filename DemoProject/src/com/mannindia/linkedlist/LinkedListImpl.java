package com.mannindia.linkedlist;

public class LinkedListImpl<T> {
	private NodeLinkedList<T> head;
	private NodeLinkedList<T> tail;

	public void add(T element) {
		NodeLinkedList<T> nd = new NodeLinkedList<>();
		nd.setValue(element);
		System.out.println("Adding the element" + element);
		if (head == null) {
			head = nd;
			tail = nd;
		} else {
			tail.setNextNode(nd);
			tail = nd;
		}
		System.out.println("Head:" + head.getValue());
		System.out.println("Tail:" + tail.getValue());
	}

	public void addAfter(T element, T after) {
		NodeLinkedList<T> tmp = head;
		NodeLinkedList<T> afterNode = null;
		while (tmp != null) {
			if (tmp.compareTo(after) == 0) {
				NodeLinkedList<T> nd = new NodeLinkedList<>();
				afterNode = tmp.getNextNode();
				nd.setValue(element);
				nd.setNextNode(afterNode);
				tmp.setNextNode(nd);
				break;
			} else {
				tmp = tmp.getNextNode();
			}
		}
	}

	public void deleteAfter(T after) {
		NodeLinkedList<T> tmp = head;
		NodeLinkedList<T> afterNode = null;
		while (tmp != null) {
			if (tmp.compareTo(after) == 0) {
				afterNode = tmp.getNextNode();
				System.out.println("The node deleted is:"
						+ afterNode.getValue());
				tmp.setNextNode(afterNode.getNextNode());
				break;
			} else {
				tmp = tmp.getNextNode();
			}
		}
	}

	public void deleteFront() {
		System.out.println("The node deleted is:" + head.getValue());
		NodeLinkedList<T> tmp = head;
		head = tmp.getNextNode();
	}

	public void traverse() {
		NodeLinkedList<T> tmp = head;
		int i = 0;
		while (tmp != null) {
			System.out.println(i + " Value: " + tmp.getValue());
			i++;
			tmp = tmp.getNextNode();
		}
	}

	public static void main(String args[]) {
		LinkedListImpl<Integer> list = new LinkedListImpl<>();
		list.add(32);
		list.add(43);
		list.addAfter(40, 32);
		list.traverse();
		list.deleteAfter(32);
		list.traverse();
	}
}
