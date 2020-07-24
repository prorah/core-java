package com.mannindia.ArrayListImpl;

import java.util.Arrays;

public class ArrayListImpl {

	private Object[] sampleArray;
	private int actSize = 0;
	private int counter = 0;

	public ArrayListImpl() {
		sampleArray = new Object[1];
	}

	public void add(Object o) {
		System.out.println("Element to be added: " + o);
		if ((sampleArray.length - 1) < actSize) {
			sampleArray = Arrays.copyOf(sampleArray, (sampleArray.length) + 1);
		}
		sampleArray[actSize] = o;
		actSize++;
	}

	public void getElement(int index) {
		if (index > (sampleArray.length) - 1) {
			throw new ArrayIndexOutOfBoundsException();
		}
		System.out.println("The Element is: " + sampleArray[index]);
	}

	public void remove(int index) {
		if (index > (sampleArray.length) - 1) {
			throw new ArrayIndexOutOfBoundsException();
		}
		System.out.println("Element to be removed is: " + sampleArray[index]);
		sampleArray[index] = null;
		while (index < actSize) {
			sampleArray[index] = sampleArray[index++];
		}
	}

	public void traverse() {
		for (Object o : sampleArray) {
			System.out.println("Element " + counter++ + ":" + o);
		}
	}

	public static void main(String args[]) {
		ArrayListImpl sampleList = new ArrayListImpl();
		sampleList.add(1);
		sampleList.add("rahul");
		sampleList.remove(1);
		sampleList.traverse();
	}

}
