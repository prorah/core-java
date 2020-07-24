package com.corejava.programs;

import java.util.Arrays;

public class StackImpl {

	public static void main(String[] args) {
		StackImpl stack = new StackImpl();
		stack.push(23);
		stack.push(24);
		stack.push(25);
		stack.push(26);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.traverseStack();
	}

	private Object[] stack = new Object[10];
	private int size = 0;

	public void push(Object o) {
		if (stack.length - size < 5) {
			increaseStackSize();
		}
		stack[size++] = o;
	}

	public void pop() {
		size = size - 1;
		stack[size] = null;
		
	}

	private void increaseStackSize() {
		stack = Arrays.copyOf(stack, stack.length * 2);
	}

	private void traverseStack() {
		System.out.println(Arrays.toString(stack));
	}

}
