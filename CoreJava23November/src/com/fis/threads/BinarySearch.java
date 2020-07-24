package com.fis.threads;

import java.util.Arrays;
import java.util.concurrent.RecursiveTask;

public class BinarySearch extends RecursiveTask<Boolean> {
	private int[] searchArray;
	private int searchElement;

	public BinarySearch(int[] searchArray, int searchElement) {
		super();
		this.searchArray = searchArray;
		this.searchElement = searchElement;
	}

	public static boolean searchArrayForElement(int[] searchArray, int searchElement) {
		for (int i = 0; i < searchArray.length; i++) {

		}
		return false;
	}

	@Override
	protected Boolean compute() {
		Arrays.sort(searchArray);
		int mid = searchArray.length / 2;
		if (searchArray[mid] == searchElement) {
			return true;
		} else if (searchArray[mid] > searchElement) {
			int[] left = Arrays.copyOfRange(searchArray, 0, mid);
			BinarySearch task = new BinarySearch(left, searchElement);
			task.fork(); //fork is used to send the task to the pool. The pool either creates a new thread to execute the
			//task or uses an existing thread.
			return task.join(); //join is used to get the output of the task

		} else if (searchArray[mid] < searchElement) {
			int[] right = Arrays.copyOfRange(searchArray, mid, searchArray.length);
			BinarySearch task = new BinarySearch(right, searchElement);
			task.fork();
			return task.join();
		}
		return false;
	}
}
