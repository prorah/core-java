package com.corejava.threads;

public class ThreadJoinTest {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread 1 execution started");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 1 execution completed");
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread 2 execution completed");
			}
		});

		t1.start();
		// below line of code causes the thread t2 to start either when t1 is
		// dead or after 1s
		t1.join(1000);
		t2.start();
	}
}
