package com.corejava.programs;

import java.util.Arrays;
import java.util.Stack;

public class BalancedStringTest {

	public static void main(String[] args) {
		String[] inputArr = new String[] { "[{()}]", "{{}{))" };
		BalancedStringTest balance = new BalancedStringTest();
		String[] outputArr = balance.testBalance(inputArr);
		System.out.println(Arrays.toString(outputArr));

	}

	String[] testBalance(String[] inputArr) {
		String[] outputArr = new String[inputArr.length];

		for (int j = 0; j < inputArr.length; j++) {

			char[] charArray = inputArr[j].toCharArray();
			Stack<Character> stack = new Stack<>();
			for (int i = 0; i < charArray.length; i++) {
				char ch = charArray[i];
				if (ch == '{' || ch == '[' || ch == '(') {
					stack.push(ch);
				} else if (ch == '}' && stack.pop() != '{') {
					outputArr[j] = "NO";
					break;
				} else if (ch == ']' && stack.pop() != '[') {
					outputArr[j] = "NO";
					break;
				} else if (ch == ')' && stack.pop() != '(') {
					outputArr[j] = "NO";
					break;
				}
			}
			if (stack.isEmpty()) {
				outputArr[j] = "YES";
			} else {
				outputArr[j] = "NO";
			}

		}
		return outputArr;
	}

}
