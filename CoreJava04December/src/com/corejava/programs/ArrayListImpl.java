package com.corejava.programs;

import java.util.Arrays;

public class ArrayListImpl {

	private Object[] arr;
	private int listSize = 0;

	public static void main(String[] args) {
		ArrayListImpl list = new ArrayListImpl();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.remove(2);
		System.out.println(list);
	}

	public ArrayListImpl() {
		arr = new Object[10];
	}

	@Override
	public String toString() {
		return Arrays.toString(arr);
	}

	public Object remove(int index) {
		Object o = arr[index];
		arr[index] = null;
		int tmp = index;
		while (tmp < listSize) {
			arr[tmp] = arr[tmp + 1];
			tmp++;
		}
		listSize--;
		return o;
	}

	public void add(Object o) {
		if (arr.length - listSize < 5) {
			increaseListSize();
		}
		arr[listSize] = o;
		listSize = listSize + 1;
	}

	public int size() {
		return arr.length;
	}

	public void increaseListSize() {
		arr = Arrays.copyOf(arr, arr.length * 2);
		System.out.println("Length of new array is: " + arr.length);
	}

}
