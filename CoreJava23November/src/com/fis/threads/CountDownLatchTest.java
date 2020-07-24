package com.fis.threads;

import java.util.concurrent.CountDownLatch;

//This program demonstrates the concept of Count Down Latch using an Online Food Order System.
public class CountDownLatchTest {

	public static void main(String[] args) throws InterruptedException {
		String[] items = new String[] { "Pizza", "Pasta", "Salad" };
		CountDownLatch latch = new CountDownLatch(items.length);
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < items.length; i++) {
				System.out.println("Before processing food items latch count is: " + latch.getCount());
				System.out.println("Item being prepared is: " + items[i]);
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				latch.countDown();// decrements the value of the count down
									// latch by 1.
				System.out.println("After processing food items latch count is: " + latch.getCount());
			}
		});
		t1.start();
		System.out.println("Restaurant has received order");
		latch.await(); // stops the main thread and resumes execution of the
						// main thread only when the value of count down latch
						// is 0.
		System.out.println("Order is completed");
	}

}
