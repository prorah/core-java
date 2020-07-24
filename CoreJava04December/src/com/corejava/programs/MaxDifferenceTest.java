package com.corejava.programs;

public class MaxDifferenceTest {

	public static void main(String[] args) {
		int[] intArr = new int[] { 7, 9, 5, 6, 3, 2 };
		System.out.println(maxDifference(intArr));
	}

	static int maxDifference(int[] intArr) {
		int maxDifference = 0;
		for (int i = 0; i < intArr.length; i++) {
			for (int j = i + 1; j < intArr.length; j++) {
				if (intArr[j] - intArr[i] > 0 && intArr[j] - intArr[i] > maxDifference) {
					maxDifference = intArr[j] - intArr[i];
				}
			}
		}
		return maxDifference;
	}
}
