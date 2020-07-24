package com.corejava.programs;

public class StringReverseTest {

	public static void main(String[] args) {
		String test = "bread";
		// System.out.println(reverse(test)); // reverse using normal for loop
		System.out.println(reverseUsingRecursion(test)); // reverse using
															// recursion

	}

	public static String reverseUsingRecursion(String str) {
		if (str.isEmpty()) {
			return str;
		}
		return str.charAt(str.length() - 1) + reverseUsingRecursion(str.substring(0,str.length()-1));

	}

	public static String reverse(String str) {
		char[] charArr = str.toCharArray();
		String outputString = "";
		for (int i = charArr.length - 1; i >= 0; i--) {
			outputString = outputString + charArr[i];
		}
		return outputString;
	}

}
