package com.fis.threads;

import java.util.concurrent.ForkJoinPool;

public class BinarySearchTest {

	public static void main(String[] args) {
		int[] searchArray = { 12, 2, 3, 6, 17, 21, 1, 8, 99, 10 };
		int searchElement = 2;
		ForkJoinPool forkJoinPool = new ForkJoinPool(50);
		BinarySearch searcher = new BinarySearch(searchArray, searchElement);
		Boolean status = forkJoinPool.invoke(searcher);
		System.out.println(" Element ::" + searchElement + " has been found in array? :: " + status);

	}

}
