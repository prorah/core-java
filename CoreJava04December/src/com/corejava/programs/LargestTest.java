package com.corejava.programs;

//Determine the largest number in an integer array
public class LargestTest {

	public static void main(String[] args) {
		int[] integerArray = new int[] { 44, 66, 99, 77, 33, 22, 55 };
		// Arrays.stream(integerArray).forEach(i -> System.out.println(i));
		int largestNumber = integerArray[0];
		for (int i = 1; i < integerArray.length; i++) {
			if (integerArray[i] > largestNumber) {
				largestNumber = integerArray[i];
			}
		}
		System.out.println(largestNumber);

	}

}
