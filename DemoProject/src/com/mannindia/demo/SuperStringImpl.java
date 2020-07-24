package com.mannindia.demo;

import java.util.Arrays;
import java.util.Comparator;

public class SuperStringImpl {

	public static void main(String[] args) {
		String overlapString = "";
		String str1 = "ctaagt";
		String str2 = "gcta";
		String smallStr;
		String bigStr;
		if (str1.length() > str2.length()) {
			smallStr = str2;
			bigStr = str1;
		} else {
			smallStr = str1;
			bigStr = str2;
		}
		String[] tempArr;
		String tempString = "";
		int startIndex;
		for (int i = 0; i < smallStr.length(); i++) {
			int counter = i;
			startIndex = bigStr.indexOf(smallStr.charAt(i));
			if (startIndex >= 0) {
				tempString = tempString + smallStr.charAt(i);
				for (int j = startIndex + 1; j < bigStr.length(); j++) {
					if (((counter + 1) < smallStr.length())
							&& (bigStr.charAt(j) == smallStr.charAt(++counter))) {
						tempString = tempString + bigStr.charAt(j);
						continue;
					} else {
						tempString = tempString + " ";
						break;
					}
				}
			} else {
				break;
			}
		}
		tempArr = tempString.split("\\s");
		Arrays.sort(tempArr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.length() - o1.length();
			}
		});
		overlapString = tempArr[0];
	}
}
