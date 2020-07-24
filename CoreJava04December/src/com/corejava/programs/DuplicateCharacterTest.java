package com.corejava.programs;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterTest {

	public static void main(String[] args) {
		String test = "bread butter";
		System.out.println(reverse(test));
		System.out.println();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < test.toCharArray().length; i++) {
			if (!(map.containsKey(test.toCharArray()[i]))) {
				map.put(test.toCharArray()[i], 1);
			} else {
				map.put(test.toCharArray()[i], map.get(test.toCharArray()[i]) + 1);
			}
		}
		map.forEach((k, v) -> {
			System.out.println(k + "," + v);
		});

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
