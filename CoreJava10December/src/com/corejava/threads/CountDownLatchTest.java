package com.corejava.threads;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch = new CountDownLatch(3);
		String[] items = new String[] { "pizza", "pasta", "juice" };
		Thread t1 = new Thread(new Restaurant(items, latch));
		t1.start();
		System.out.println("Order received by Restaurant");
		latch.await();
		System.out.println("Order Done");

	}

}

class Restaurant implements Runnable {
	private String[] items;
	private CountDownLatch latch;

	public Restaurant(String[] items, CountDownLatch latch) {
		super();
		this.items = items;
		this.latch = latch;
	}

	@Override
	public void run() {
		for (int i = 0; i < items.length; i++) {
			System.out.println("Order for " + items[i] + " has arrived");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			latch.countDown();
			System.out.println(items[i] + " is prepared");
		}
	}

}
