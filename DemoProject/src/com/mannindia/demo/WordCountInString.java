package com.mannindia.demo;

//Another approach is \\s+ regex pattern
public class WordCountInString {

	public static void main(String[] args) {
		String sampleString = "This is acount string";
		char[] countArray = sampleString.toCharArray();
		int count = 0;
		for (int i = 0; i < countArray.length; i++) {
			if (countArray[i] == ' ') {
				if (countArray[i + 1] != ' ') {
					count++;
				}
			}
		}
		System.out.println("The length of the input " + (count + 1));
	}

}
