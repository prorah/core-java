package com.corejava.threads;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(() -> {
			System.out.println("Thread t started running");
			System.out.println("Before calling sleep");
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
			}
			System.out.println("After calling sleep");
		});

		Thread t1 = new Thread(() -> {
			System.out.println("Thread  t1 started running");
		});

		t.start();
		t.join();
		t1.start();
	}

}
