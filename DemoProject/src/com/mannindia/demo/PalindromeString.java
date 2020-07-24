package com.mannindia.demo;

public class PalindromeString {

	public static void main(String[] args) {
		String stringToReverse = "122";
		char[] originalCharArray = stringToReverse.toCharArray();
		char[] reverseCharArray = new char[stringToReverse.length()];
		int counter = 0;
		for (int i = originalCharArray.length - 1; i >= 0; i--) {
			reverseCharArray[counter] = originalCharArray[i];
			counter++;
		}
		String reverseString = String.valueOf(reverseCharArray);
		if (stringToReverse.equalsIgnoreCase(reverseString))
			System.out.println("yes palindrome");
		else {
			System.out.println("not palindrome");
		}
	}

}
