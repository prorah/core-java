package com.corejava.programs;

import java.util.Stack;

public class BalancedString {

	public static void main(String[] args) {
		String inputString = "{{(())}}[[";
		char[] str = inputString.toCharArray();
		System.out.println(checkIfBalanced(str));
	}

	public static boolean checkIfBalanced(char[] str) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length; i++) {
			char ch = str[i];
			if (ch == '{' || ch == '[' || ch == '(') {
				stack.push(str[i]);
			} else if (ch == '}') {
				if (stack.isEmpty() || stack.pop() != '{') {
					return false;
				}
			} else if (ch == ']') {
				if (stack.isEmpty() || stack.pop() != '[') {
					return false;
				}
			} else if (ch == ')') {
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}
