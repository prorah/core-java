package com.mannindia.QueueImpl;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueImpl {

	public static void main(String[] args) {

		int[] ia = { 1, 5, 3, 7, 6, 9, 8 };
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
		for (int x : ia) {
			pq1.offer(x);
		}
		for (int x : ia) {
			// returns and remove the highest priority (as per natural order)
			// element in the queue
			System.out.print(pq1.poll() + " ");
		}
		System.out.println("");
		// below 10 is the initial capacity of pq2
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(10,
				new Comparator<Integer>() {
					@Override
					public int compare(Integer one, Integer two) {
						return two - one;
					}
				});

		for (int x : ia) {
			pq2.offer(x);
		}
		System.out.println("size " + pq2.size());
		// peek method returns the highest priority element in the queue
		System.out.println("peek " + pq2.peek());
		System.out.println("size " + pq2.size());
		// poll method returns and removes the highest priority element from the
		// queue
		System.out.println("poll " + pq2.poll());
		System.out.println("size " + pq2.size());
		for (int x : ia) {
			System.out.print(pq2.poll() + " ");
		}
	}

}
