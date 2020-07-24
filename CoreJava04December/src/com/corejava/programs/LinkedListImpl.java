package com.corejava.programs;

public class LinkedListImpl<K> {

	public static void main(String[] args) {
		LinkedListImpl<Integer> linkedList = new LinkedListImpl<>();
		linkedList.add(23);
		linkedList.add(43);
		linkedList.addAfter(33, 43);
		linkedList.traverse();
	}

	private Node<K> head;
	private Node<K> tail;

	public void add(K element) {
		Node<K> node = new Node<K>();
		node.setValue(element);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNextNode(node);
			tail = node;
		}
	}

	public void deleteFront() {
		Node<K> tmp = head;
		head = tmp.getNextNode();
		System.out.println("Deleted Node: " + tmp.getValue());
	}

	public void traverse() {
		Node<K> tmp = head;
		while (true) {
			System.out.println(tmp.getValue());
			if (tmp.getNextNode() == null) {
				break;
			}
			tmp = tmp.getNextNode();
		}
	}

	public void addAfter(K element, K after) {
		Node<K> tmp = head;
		Node<K> node1;
		Node<K> node2;
		Node<K> newNode = new Node<>();
		newNode.setValue(element);
		while (true) {
			if (tmp.getValue() == after) {
				node1 = tmp;
				node2 = tmp.getNextNode();
				break;
			}
			tmp = tmp.getNextNode();
		}
		node1.setNextNode(newNode);
		newNode.setNextNode(node2);
	}

}
