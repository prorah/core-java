package com.fis.threads;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
	public static void main(String[] args) throws InterruptedException {
		String[] items = new String[] { "pizza", "burger", "sandwich" };
		CountDownLatch latch = new CountDownLatch(items.length);
		Thread t1 = new Thread(new Restaurant(latch, items));
		t1.start();
		System.out.println("Restaurant has received order");
		latch.await();
		System.out.println("Order is prepared");
	}

}

class Restaurant implements Runnable {

	private CountDownLatch latch;
	private String[] items;

	public Restaurant(CountDownLatch latch, String[] items) {
		super();
		this.latch = latch;
		this.items = items;
	}

	@Override
	public void run() {
		for (int i = 0; i < items.length; i++) {
			System.out.println("Item being prepared is: " + items[i]);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			latch.countDown();
			System.out.println("Item done is: " + items[i]);
		}

	}

}
