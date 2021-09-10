package com.demo.programs;

import java.util.Arrays;

public class ArrayListImpl {

	private Object[] arr;
	private int size;

	public static void main(String[] args) {
		ArrayListImpl list = new ArrayListImpl();
		list.add(2);
		list.add(43);
		list.add(33);
		list.add(34);
		list.add(99);
		list.add(13);
		list.traverse();
		list.remove(2);
		System.out.println("--------------------------");
		list.traverse();
	}

	public ArrayListImpl() {
		arr = new Object[5];
		
		size = 0;
	}

	public void add(Object o) {
		if (arr.length - size < 1) {
			increaseListSize();
		}
		arr[size] = o;
		size++;
	}

	public void traverse() {
		Arrays.stream(arr).forEach(s -> System.out.println(s));
	}

	public void increaseListSize() {
		arr = Arrays.copyOf(arr, arr.length * 2);
	}

	public Object remove(int index) {
		Object o = arr[index];
		int tmp = index;
		arr[index] = null;
		while (tmp < arr.length) {
			arr[tmp] = arr[tmp + 1];
			tmp++;
			if (arr[tmp] == null) {
				break;
			}
		}
		return o;
	}
}
