package com.corejava.test;

import java.util.Arrays;

public class ArrayListImpl {
	private Object[] array;
	int size = 0;

	public static void main(String[] args) {
		ArrayListImpl list = new ArrayListImpl();
		list.add(23);
		list.add(45);
		list.traverseList();

	}

	ArrayListImpl() {
		array = new Object[10];
	}

	private void add(Object o) {
		if (array.length - size < 5) {
			increaseListSize();
		}
		array[size] = o;
		size++;
	}

	private void increaseListSize() {
		array = Arrays.copyOf(array, (array.length) * 2);
	}

	public void traverseList() {
		System.out.println(Arrays.toString(array));
	}

}
