package com.corejava.programs;

import java.util.Scanner;

public class BinarySearchTest {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 4, 6, 8, 10, 12, 14, 16 };
		System.out.println("Enter the element you want to search:");
		Scanner sc = new Scanner(System.in);
		int searchElement = sc.nextInt();
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = (start + end) / 2;
			if (arr[mid] == searchElement) {
				System.out.println(mid);
				break;
			} else if (arr[mid] > searchElement) {
				end = mid;
			} else {
				start = mid + 1;
			}

		}
	}

}
