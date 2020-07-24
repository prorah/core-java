package com.mannindia.demo;

public class StringReverseWithoutBuffer {

	public static void main(String[] args) {
		String stringToReverse = "aba";
		char[] originalCharArray = stringToReverse.toCharArray();
		char[] reverseCharArray = new char[stringToReverse.length()];
		int counter = 0;
		for (int i = originalCharArray.length - 1; i >= 0; i--) {
			reverseCharArray[counter] = originalCharArray[i];
			System.out.println(reverseCharArray[counter]);
			counter++;
		}

	}

}
