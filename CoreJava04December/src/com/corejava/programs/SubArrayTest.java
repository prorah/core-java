package com.corejava.programs;

public class SubArrayTest {

	public static void main(String[] args) {
		int[] arr = new int[] { 15, 51, 7, 81, 5, 11, 25 };
		int sum = 41;
		for (int i = 0; i < arr.length; i++) {
			int initialj = i + 1;
			int localSum = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				localSum = localSum + arr[j];
				if (localSum > sum) {
					break;
				}
				if (localSum == sum) {
					System.out.println(arr[i]);
					for (int k = initialj; k <= j; k++) {
						System.out.println(arr[k]);
					}
				}
			}

		}
	}

}
