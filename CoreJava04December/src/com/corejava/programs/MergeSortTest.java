package com.corejava.programs;

public class MergeSortTest {
	private int[] array;
	private int length;

	public static void main(String a[]) {

		int[] inputArr = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
		MergeSortTest mms = new MergeSortTest();
		mms.sort(inputArr);
		for (int i : inputArr) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

	public void sort(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		mergeSort(array, length);
	}

	public static void mergeSort(int[] a, int n) {
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int[] leftArray = new int[mid];
		int[] rightArray = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			leftArray[i] = a[i];
		}
		for (int i = mid; i < n; i++) {
			rightArray[i - mid] = a[i];
		}
		mergeSort(leftArray, mid);
		mergeSort(rightArray, n - mid);

		merge(a, leftArray, rightArray, leftArray.length, rightArray.length);
	}

	public static void merge(int[] a, int[] leftArray, int[] rightArray, int leftArrayLength, int rightArrayLength) {

		int i = 0, j = 0, k = 0;
		while (i < leftArrayLength && j < rightArrayLength) {
			if (leftArray[i] <= rightArray[j]) {
				a[k++] = leftArray[i++];
			} else {
				a[k++] = rightArray[j++];
			}
		}
		while (i < leftArrayLength) {
			a[k++] = leftArray[i++];
		}
		while (j < rightArrayLength) {
			a[k++] = rightArray[j++];
		}
	}
}
