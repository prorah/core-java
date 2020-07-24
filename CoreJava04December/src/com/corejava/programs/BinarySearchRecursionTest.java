package com.corejava.programs;

import java.util.Scanner;

public class BinarySearchRecursionTest {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 4, 6, 8, 10, 12, 14, 16 };
		System.out.println("Enter the element you want to search:");
		Scanner sc = new Scanner(System.in);
		int searchElement = sc.nextInt();
		System.out.println(searchRecursion(arr, searchElement, 0, arr.length - 1));
	}

	public static int searchRecursion(int[] arr, int searchElement, int start, int end) {
		int mid = (start + end) / 2;
		if (arr[mid] == searchElement) {
			return mid;
		} else if (arr[mid] > searchElement) {
			return searchRecursion(arr, searchElement, start, mid);
		}
		return searchRecursion(arr, searchElement, mid + 1, end);
	}

}
