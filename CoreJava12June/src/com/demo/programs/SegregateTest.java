package com.demo.programs;

import java.util.Arrays;

public class SegregateTest {

	public static void main(String[] args) {
		int[] inputArray = new int[] { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1 };
		segregate01Method(inputArray);
		Arrays.stream(inputArray).forEach(s -> System.out.println(s));
	}

	static void segregate01Method(int[] inputArray) {
		int left = 0;
		int right = inputArray.length - 1;

		while (left < right) {
			while (inputArray[left] == 0 && left < right) {
				left++;
			}
			while (inputArray[right] == 1 && left < right) {
				right--;
			}
			if (left < right) {
				inputArray[left] = 0;
				inputArray[right] = 1;
				left++;
				right--;
			}
		}
	}
}
