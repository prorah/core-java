package com.corejava.programs;

public class LinkedListImpl<K> {

	public static void main(String[] args) {

		LinkedListImpl<Integer> list = new LinkedListImpl<>();
		list.add(31);
		list.add(22);
		list.add(1);
		list.traverse();
		list.deleteFront();
		list.traverse();
	}

	private Node<K> head;
	private Node<K> tail;

	public void add(K element) {
		Node<K> temp = new Node<>();
		temp.setData(element);
		if (head == null) {
			head = temp;
			tail = temp;
		} else {
			tail.setNextNode(temp);
			tail = temp;
		}
	}

	public void traverse() {
		Node<K> temp = head;
		while (true) {
			System.out.println(temp.getData());
			if (temp.getNextNode() == null) {
				break;
			}
			temp = temp.getNextNode();
		}
	}
	
	public void deleteFront(){
		Node<K> temp=head.getNextNode();
		head=temp;
	}
}
