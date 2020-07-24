package com.corejava.programs;

import java.util.Arrays;

public class Seggregate01Test {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };
		arr = segregate0and1(arr, arr.length);
		System.out.println(Arrays.toString(arr));

	}

	static int[] segregate0and1(int arr[], int size) {
		/* Initialize left and right indexes */
		int left = 0, right = size - 1;

		while (left < right) {
			/* Increment left index while we see 0 at left */
			while (arr[left] == 1 && left < right)
				left++;

			/* Decrement right index while we see 1 at right */
			while (arr[right] == 0 && left < right)
				right--;

			/*
			 * If left is smaller than right then there is a 1 at left and a 0
			 * at right. Exchange arr[left] and arr[right]
			 */
			if (left < right) {
				arr[left] = 1;
				arr[right] = 0;
				left++;
				right--;
			}
		}
		return arr;
	}

}
