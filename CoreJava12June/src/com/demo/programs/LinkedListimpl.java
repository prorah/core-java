package com.demo.programs;

public class LinkedListimpl<K> {

	private Node<K> head;
	private Node<K> tail;

	public static void main(String[] args) {
		LinkedListimpl<Integer> list = new LinkedListimpl<Integer>();
		list.add(22);
		list.add(33);
		list.add(4);
		list.traverse();

	}

	public void add(K element) {
		Node<K> tmp = new Node<>();
		tmp.setElement(element);
		if (head == null) {
			head = tmp;
			tail = tmp;
		} else {
			tail.setNextNode(tmp);
			tail = tmp;
		}
	}

	public void traverse() {
		Node<K> tmp = head;
		while (tmp != null) {
			System.out.println(tmp.getElement());
			tmp = tmp.getNextNode();
		}
	}

}
