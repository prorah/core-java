package com.corejava.programs;

//Determine the largest and second largest number from an integer array
public class LargestSecondTest {

	public static void main(String[] args) {
		int[] integerArray = new int[] { 44, 66, 99, 77, 33, 22, 55 };
		// Arrays.stream(integerArray).forEach(i -> System.out.println(i));
		int largest = integerArray[1];
		int secondLargest = integerArray[0];

		for (int i = 2; i < integerArray.length; i++) {
			if (integerArray[i] > largest && integerArray[i] > secondLargest) {
				secondLargest = largest;
				largest = integerArray[i];
			}
			if (integerArray[i] < largest && integerArray[i] > secondLargest) {
				secondLargest = integerArray[i];
			}
		}
		System.out.println("Largest: " + largest);
		System.out.println("Second Largest:" + secondLargest);
	}

}
